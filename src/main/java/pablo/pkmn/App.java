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


        pkms.readFromFile(Path.of("./src/main/java/pablo/pkmn/data/pokemon.json").toFile());

    }
}
