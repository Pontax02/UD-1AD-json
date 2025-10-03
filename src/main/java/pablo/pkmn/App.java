package pablo.pkmn;

import pablo.pkmn.storage.Pkmstorage;

import java.nio.file.Path;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Pkmstorage pkms = new Pkmstorage();


        List<PokedexItem> pokemonList = pkms.readFromFile(Path.of("./src/main/java/pablo/pkmn/data/pokemon.json").toFile());


        System.out.println("Todos los pokemon");
        pokemonList.forEach(System.out::println);

        System.out.println();
        System.out.println("Nombres de los pokemon");
        System.out.println(pokemonList.stream().map(PokedexItem::getName).toList());

        System.out.println();
        System.out.println("Que movimientos aprenden los pokemon de tipo fuego");
        System.out.println(pokemonList.stream().filter(p -> p.getTypes().contains("Fire")).map(PokedexItem::getMoves).toList());


        System.out.println();
        System.out.println("Cuales son las evoluciones de bulbasaur");
        System.out.println(pokemonList.stream().filter(p -> p.getName().equals("BULBASAUR")).map(PokedexItem::getEvolutions).toList());

        System.out.println();
        System.out.println("Cual es el ratio de genero de charmander");
        System.out.println(pokemonList.stream().filter(p -> p.getName().equals("CHARMANDER")).map(PokedexItem::getRatio).toList());
    }
}
