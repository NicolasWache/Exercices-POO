
public class City {

	private String nameCity;
	private String country;
	private int population;
	private static int nbreInstances = 0;
	
	public City (String nameCity, String country, int population) {
		this.nameCity = nameCity;
		this.country = country;
		this.population = population;
		nbreInstances++;
	}
	public City (String nameCity, String country) {
		this.nameCity = nameCity;
		this.country = country;
		this.population = 0;
		nbreInstances++;
	}
	
	public City (String nameCity, int population) {
		this.nameCity = nameCity;
		this.country = "unknown";
		this.population = population;
		nbreInstances++;
	}
	public void display() {
		System.out.println("Ville: " +nameCity + "\t" +
						   "Pays: "+country + "\t" +
						   "Nombre d'habitants: " + population);
	}
	public String getNameCity() {
		return nameCity;
	}
	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPopulation() {
		return population;
	}
	
	
	public void setPopulation(int population) {
		if (population >= this.population) {
			this.population = population;
		}else {
			System.out.println("Un nombre d'habitant ne peux pas baisser enfin !!!");
		}
	}
	@Override
	public String toString() {
		return "Ville de Naissance:  " + nameCity + " " + country + " " + population + " habitants";
	}
	public static int getNbreInstances() {
		return nbreInstances;
	}
	public static void setNbreInstances(int nbreInstances) {
		City.nbreInstances = nbreInstances;
	}
	
}
