package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ratio{

	@JsonProperty("female")
	private Object female;

	@JsonProperty("male")
	private Object male;

	public void setFemale(Object female){
		this.female = female;
	}

	public Object getFemale(){
		return female;
	}

	public void setMale(Object male){
		this.male = male;
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