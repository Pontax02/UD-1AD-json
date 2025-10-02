package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ratio{

	@JsonProperty("female")
	private Object female;

	@JsonProperty("male")
	private Object male;

	public Object getFemale(){
		return female;
	}

	public Object getMale(){
		return male;
	}

	@Override
 	public String toString(){
		return 
			"Ratio{" + 
			"female = '" + female + '\'' + 
			",male = '" + male + '\'' + 
			"}";
		}
}