package WireTransfer;

public class Country {
	
	public static String name;
	public static int ID;
	
	public boolean equals(Object o) {
		Country c = (Country)o;
		if (c.name.equals(this.name)) 
			return true;
		return false;
	}
	public String toString() {
		return name;
	}
	

}
