package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TmHmItem{

	@JsonProperty("lvl")
	private String lvl;

	@JsonProperty("machine")
	private String machine;

	@JsonProperty("name")
	private String name;

	public String getLvl(){
		return lvl;
	}

	public String getMachine(){
		return machine;
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