
public class Address {
	private String houseNo;
	private String street;
	private String vlg;
	private String city;
	private String state;
	private int pincode;
	Address(){
		
	}
	
	public Address(String houseNo, String street, String vlg, String city, String state, int pincode) {
		this.houseNo = houseNo;
		this.street = street;
		this.vlg = vlg;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getVlg() {
		return vlg;
	}
	public void setVlg(String vlg) {
		this.vlg = vlg;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String toString() {
		return houseNo+", "+street+", "+vlg+", "+city+", "+state+", "+pincode;
	}
}
