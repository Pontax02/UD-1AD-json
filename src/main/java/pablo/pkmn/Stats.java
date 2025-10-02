package pablo.pkmn;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stats{

	@JsonProperty("DEF")
	private int dEF;

	@JsonProperty("SDF")
	private int sDF;

	@JsonProperty("SPD")
	private int sPD;

	@JsonProperty("SAT")
	private int sAT;

	@JsonProperty("HP")
	private int hP;

	@JsonProperty("ATK")
	private int aTK;

	public int getDEF(){
		return dEF;
	}

	public int getSDF(){
		return sDF;
	}

	public int getSPD(){
		return sPD;
	}

	public int getSAT(){
		return sAT;
	}

	public int getHP(){
		return hP;
	}

	public int getATK(){
		return aTK;
	}

	@Override
 	public String toString(){
		return 
			"Stats{" + 
			"dEF = '" + dEF + '\'' + 
			",sDF = '" + sDF + '\'' + 
			",sPD = '" + sPD + '\'' + 
			",sAT = '" + sAT + '\'' + 
			",hP = '" + hP + '\'' + 
			",aTK = '" + aTK + '\'' + 
			"}";
		}
}