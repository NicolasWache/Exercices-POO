
public class testPerson {

	public static void main(String[] args) {
		
		// Exercice 1.9
		
		//Person manu = new Person ("Macron", "Emmanuel", 43, "L'Elysée à Paris", new City ("Amiens", "France"));
		//Person poutine = new Person ("Poutine", "Vladimir", 68);
		//Person biden = new Person ("Biden", "Joe");
		
		//System.out.println(manu);
		//System.out.println(poutine);
		//System.out.println(biden);
		
		
		Person[] persons = new Person[6];
		persons[0] = new Person("Macron", "Emmanuel", 43, "L'Elysée à Paris", new City("Amiens", "France"));
		persons[1] = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
		persons[2] = new Person("Johnson", "Boris", 56, "Downing street à Londres", new City("New York", "Etats-Unis"));
		persons[3] = new Person ("Depardieu", "Gerard", 72, "Moscou", new City ("Chateauroux", "France"));
		persons[4] = new Person ("Kravitz", "Lenny", 56, "Hotel Particulier à Paris", new City ("New-York", "USA"));
		persons[5] = new Person ("Lawrence", "Jennifer", 30, "Louisville aux USA", new City ("Idan Hills", "USA"));
		
		for (Person person : persons) {if (person.getAddress().toLowerCase().contains("paris") || person.getBirthCity().getCountry().toLowerCase().contains("france"))
			System.out.println(person);
		}
		
	}
	
}
