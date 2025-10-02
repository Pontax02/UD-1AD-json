package pablo.pkmn;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PokedexItem{

	@JsonProperty("types")
	private List<String> types;

	@JsonProperty("egg_groups")
	private List<String> eggGroups;

	@JsonProperty("weight")
	private Object weight;

	@JsonProperty("description")
	private String description;

	@JsonProperty("stats")
	private Stats stats;

	@JsonProperty("species")
	private String species;

	@JsonProperty("moves")
	private Moves moves;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("ability")
	private String ability;

	@JsonProperty("evolutions")
	private List<EvolutionsItem> evolutions;

	@JsonProperty("exp")
	private int exp;

	@JsonProperty("ratio")
	private Ratio ratio;

	@JsonProperty("height")
	private Object height;

	public List<String> getTypes(){
		return types;
	}

	public List<String> getEggGroups(){
		return eggGroups;
	}

	public Object getWeight(){
		return weight;
	}

	public String getDescription(){
		return description;
	}

	public Stats getStats(){
		return stats;
	}

	public String getSpecies(){
		return species;
	}

	public Moves getMoves(){
		return moves;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getAbility(){
		return ability;
	}

	public List<EvolutionsItem> getEvolutions(){
		return evolutions;
	}

	public int getExp(){
		return exp;
	}

	public Ratio getRatio(){
		return ratio;
	}

	public Object getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"PokedexItem{" + 
			"types = '" + types + '\'' + 
			",egg_groups = '" + eggGroups + '\'' + 
			",weight = '" + weight + '\'' + 
			",description = '" + description + '\'' + 
			",stats = '" + stats + '\'' + 
			",species = '" + species + '\'' + 
			",moves = '" + moves + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",ability = '" + ability + '\'' + 
			",evolutions = '" + evolutions + '\'' + 
			",exp = '" + exp + '\'' + 
			",ratio = '" + ratio + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}