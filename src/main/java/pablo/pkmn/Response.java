package pablo.pkmn;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("pokedex")
	private List<PokedexItem> pokedex;

	public List<PokedexItem> getPokedex(){
		return pokedex;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"pokedex = '" + pokedex + '\'' + 
			"}";
		}
}