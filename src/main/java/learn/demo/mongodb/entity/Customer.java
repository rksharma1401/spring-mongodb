package learn.demo.mongodb.entity;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	public String id;

	public String firstName;
	public String lastName;
	public Address address;

	public Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Customer(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=").append(id).append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append(", address=").append(address).append("]");
		return builder.toString();
	}

}