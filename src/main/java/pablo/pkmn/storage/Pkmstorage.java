package pablo.pkmn.storage;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pablo.pkmn.PokedexItem;
import pablo.pkmn.PokedexWrapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Pkmstorage {

    private final Logger logger = LoggerFactory.getLogger(Pkmstorage.class.getName());


    public List<PokedexItem> readFromFile(File file) {
        logger.debug("Leyendo pokemons " + file);

        if (!file.exists() || !file.isFile() || !file.canRead()) {
            logger.error("El fichero no existe, o no es un fichero o no se puede leer: " + file);
        }
        try {
            ObjectMapper mapper = new ObjectMapper();

            PokedexWrapper listaPokemons = mapper.readValue(
                    file,
                    PokedexWrapper.class
            );


            return listaPokemons.getPokedex();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }

}
