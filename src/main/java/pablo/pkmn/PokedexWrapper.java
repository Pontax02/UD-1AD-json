package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PokedexWrapper {
    @JsonProperty("pokedex")
    private List<PokedexItem> pokedex;

    public List<PokedexItem> getPokedex() {
        return pokedex;
    }

    public void setPokedex(List<PokedexItem> pokedex) {
        this.pokedex = pokedex;
    }
}