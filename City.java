package WireTransfer;

public class City {
	public static String name;
	public static int ID;
	Country country;
	
	public boolean equals(Object o) {
		City ci = (City)o;
		if (ci.name.equals(this.name)) 
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
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

}
