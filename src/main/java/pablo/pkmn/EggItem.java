package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EggItem{

	@JsonProperty("name")
	private String name;

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"EggItem{" + 
			"name = '" + name + '\'' + 
			"}";
		}
}