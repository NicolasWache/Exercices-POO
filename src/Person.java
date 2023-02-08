
public class Person {

	private String lastName;
	private String firstName;
	private int age;
	private String address;
	public City birthCity;
	
	
	public Person (String lastName, String firstName, int age, String adress, City birthCity) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = adress;
		this.birthCity = birthCity;
	}
	public Person (String lastName, String firstName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	public Person (String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return lastName + ", " + firstName + ", " + age + "ans, habitant " + address
				+ " BornCity " + birthCity ;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public City getBirthCity() {
		
		return birthCity;
	}

}
