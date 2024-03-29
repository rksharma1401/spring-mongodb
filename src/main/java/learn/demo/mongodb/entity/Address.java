package learn.demo.mongodb.entity;

public class Address {
	
	

	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", state=" + state + "]";
	}

	private String address;
	private String city;
	private String state;
	
	public Address() {
		super();
 	}
	public Address(String address, String city, String state) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
