package WireTransfer;

public class Bank {
	
	String bankAcount;
	String bankname;
	
	public boolean equals(Object o) {
		Bank b = (Bank)o;
		if (b.bankname.equals(this.bankname)) 
			return true;
		return false;
	}
	public String toString() {
		return bankname;
	}
	
	public String getBankAcount() {
		return bankAcount;
	}
	public void setBankAcount(String bankAcount) {
		this.bankAcount = bankAcount;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

}
