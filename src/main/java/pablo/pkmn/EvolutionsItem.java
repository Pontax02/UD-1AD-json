package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EvolutionsItem{

	@JsonProperty("lvl")
	private Object lvl;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	public void setLvl(Object lvl){
		this.lvl = lvl;
	}

	public Object getLvl(){
		return lvl;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
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