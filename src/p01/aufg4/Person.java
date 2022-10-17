package p01.aufg4;

import java.util.Objects;

public class Person {
	
	private final String name;
	private final String city;
	private String street;
	private String zipcode;
	
	public Person(String name, String city, String street, String zipcode) {
		
		Objects.requireNonNull(name, "parameter 'name' must not be null!");
		Objects.requireNonNull(name, "parameter 'city' must not be null!");
		
		this.name = name;
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Person other = (Person) obj;
		return name.equals(other.getName()) && city.equals(other.getCity());
	}
	
	
	
}
