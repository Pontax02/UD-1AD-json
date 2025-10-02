package pablo.pkmn;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Moves{

	@JsonProperty("egg")
	private List<EggItem> egg;

	@JsonProperty("level_up")
	private List<LevelUpItem> levelUp;

	@JsonProperty("tm_hm")
	private List<TmHmItem> tmHm;

	public void setEgg(List<EggItem> egg){
		this.egg = egg;
	}

	public List<EggItem> getEgg(){
		return egg;
	}

	public void setLevelUp(List<LevelUpItem> levelUp){
		this.levelUp = levelUp;
	}

	public List<LevelUpItem> getLevelUp(){
		return levelUp;
	}

	public void setTmHm(List<TmHmItem> tmHm){
		this.tmHm = tmHm;
	}

	public List<TmHmItem> getTmHm(){
		return tmHm;
	}

	@Override
 	public String toString(){
		return 
			"Moves{" + 
			"egg = '" + egg + '\'' + 
			",level_up = '" + levelUp + '\'' + 
			",tm_hm = '" + tmHm + '\'' + 
			"}";
		}
}