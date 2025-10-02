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

	public void setDEF(int dEF){
		this.dEF = dEF;
	}

	public int getDEF(){
		return dEF;
	}

	public void setSDF(int sDF){
		this.sDF = sDF;
	}

	public int getSDF(){
		return sDF;
	}

	public void setSPD(int sPD){
		this.sPD = sPD;
	}

	public int getSPD(){
		return sPD;
	}

	public void setSAT(int sAT){
		this.sAT = sAT;
	}

	public int getSAT(){
		return sAT;
	}

	public void setHP(int hP){
		this.hP = hP;
	}

	public int getHP(){
		return hP;
	}

	public void setATK(int aTK){
		this.aTK = aTK;
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