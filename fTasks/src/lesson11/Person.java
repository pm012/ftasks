package lesson11;

public class Person implements Comparable {
	private String name;
	private String phone;

	public Person(String name, String phone) {
		setName(name);
		setPhone(phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int compareTo(Object o) {

		return name.compareTo(((Person) o).getName());
	}

	public String toString() {
		return "Name: " + this.getName() + " Phone: " + this.getPhone() + "\n";

	}

}
