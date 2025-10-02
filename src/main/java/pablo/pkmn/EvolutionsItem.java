package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EvolutionsItem{

	@JsonProperty("lvl")
	private Object lvl;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	public Object getLvl(){
		return lvl;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"EvolutionsItem{" + 
			"lvl = '" + lvl + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}