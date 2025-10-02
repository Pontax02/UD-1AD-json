package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LevelUpItem{

	@JsonProperty("lvl")
	private int lvl;

	@JsonProperty("name")
	private String name;

	public void setLvl(int lvl){
		this.lvl = lvl;
	}

	public int getLvl(){
		return lvl;
	}

	public void setName(String name){
		this.name = name;
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