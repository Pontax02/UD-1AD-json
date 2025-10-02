package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TmHmItem{

	@JsonProperty("lvl")
	private String lvl;

	@JsonProperty("machine")
	private String machine;

	@JsonProperty("name")
	private String name;

	public void setLvl(String lvl){
		this.lvl = lvl;
	}

	public String getLvl(){
		return lvl;
	}

	public void setMachine(String machine){
		this.machine = machine;
	}

	public String getMachine(){
		return machine;
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
			"TmHmItem{" + 
			"lvl = '" + lvl + '\'' + 
			",machine = '" + machine + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}