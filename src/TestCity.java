
public class TestCity {

	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 450000);
		City bayonne = new City("Bayonne", "France", 40000);
		City stGeours = new City("Saint Geours de Maremne", "France", 7800);
		City sanSebastien = new City("Saint Sebastien", "Espagne", 63000);
		City idron = new City("Idron", "France");
		City rabat = new City("Rabat", 577000);
		
		//Exercice 1 
		
		toulouse.display();
		bayonne.display();
		stGeours.display();
		sanSebastien.display();
		idron.display();
		
		//toulouse.population=20000;
		//toulouse.display();
		
		// Exercice 2
		
		System.out.println(toulouse.getNameCity());
		toulouse.setPopulation(-200);
		System.out.println(toulouse.getPopulation());
		toulouse.setPopulation(370000);
		System.out.println(toulouse.getPopulation());
		toulouse.display();
		
		//Exercice 3
		
		rabat.display();
		rabat.setCountry("Maroc");
		rabat.display();
		
		// Exercice 1.4
		
		toulouse.display();
		
		// Exercice 1.5 et 1.6
		
		System.out.println(toulouse);
		
		// Exercice 1.7
		
		System.out.println(City.getNbreInstances());
		
		
		
	}

	
	
}
