package p01.aufg4;

import java.util.Objects;

public class RefinedPerson extends Person {
	
	private String nickName;

	public RefinedPerson(String name, String city, String street, String zipcode, String nickName) {
		super(name, city, street, zipcode);
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		RefinedPerson other = (RefinedPerson) obj;
		Person person = new Person(getName(), getCity(), getStreet(), getZipcode());
		Person otherPerson = new Person(other.getName(), other.getCity(), other.getStreet(), other.getZipcode());
		
		return nickName.equals(other.nickName) && person.equals(otherPerson);
	}
	
	

}
