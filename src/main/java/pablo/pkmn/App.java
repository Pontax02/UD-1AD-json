package pablo.pkmn;

import pablo.pkmn.storage.Pkmstorage;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Pkmstorage pkms = new Pkmstorage();


        List<PokedexItem> pokemonList = pkms.readFromFile(Path.of("./src/main/java/pablo/pkmn/data/pokemon.json").toFile());

        pokemonList.forEach(System.out::println);

        System.out.println(pokemonList.stream().map(PokedexItem::getName).toList());

    }
}
