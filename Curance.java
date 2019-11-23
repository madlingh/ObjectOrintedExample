package WireTransfer;

public class Curance {
	public static double rate;
	public static String name;
	
	public boolean equals(Object o) {
		Curance cu = (Curance)o;
		if (cu.name.equals(this.name)) 
			return true;
		return false;
	}
	public String toString() {
		return name;
	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
