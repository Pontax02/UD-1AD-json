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

	public void setTypes(List<String> types){
		this.types = types;
	}

	public List<String> getTypes(){
		return types;
	}

	public void setEggGroups(List<String> eggGroups){
		this.eggGroups = eggGroups;
	}

	public List<String> getEggGroups(){
		return eggGroups;
	}

	public void setWeight(Object weight){
		this.weight = weight;
	}

	public Object getWeight(){
		return weight;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setSpecies(String species){
		this.species = species;
	}

	public String getSpecies(){
		return species;
	}

	public void setMoves(Moves moves){
		this.moves = moves;
	}

	public Moves getMoves(){
		return moves;
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

	public void setAbility(String ability){
		this.ability = ability;
	}

	public String getAbility(){
		return ability;
	}

	public void setEvolutions(List<EvolutionsItem> evolutions){
		this.evolutions = evolutions;
	}

	public List<EvolutionsItem> getEvolutions(){
		return evolutions;
	}

	public void setExp(int exp){
		this.exp = exp;
	}

	public int getExp(){
		return exp;
	}

	public void setRatio(Ratio ratio){
		this.ratio = ratio;
	}

	public Ratio getRatio(){
		return ratio;
	}

	public void setHeight(Object height){
		this.height = height;
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