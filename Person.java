package WireTransfer;

public class Person {
	
	public static String name;
	public static int numID;
	public static double phoneNumber;
	
	public boolean equals(Object o) {
		Person p = (Person)o;
		if (p.name.equals(this.name)) 
			return true;
		return false;
	}
	public String toString() {
		return name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumID() {
		return numID;
	}
	public void setNumID(int numID) {
		this.numID = numID;
	}
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
