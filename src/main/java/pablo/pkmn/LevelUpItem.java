package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LevelUpItem{

	@JsonProperty("lvl")
	private int lvl;

	@JsonProperty("name")
	private String name;

	public int getLvl(){
		return lvl;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"LevelUpItem{" + 
			"lvl = '" + lvl + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}