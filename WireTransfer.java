package WireTransfer;

public class WireTransfer {
	
	public static  String purpes;
	public static double orginalAmount;
	public static double fees;
	public static double finalAmount;
	
	Person person;
	Sender sender;
	Reciver reciver;
	Curance curance;
	
	public String toString() {
		String output = " "+ sender.getName()+" "+ reciver.getName();
		return output;
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public Reciver getReciver() {
		return reciver;
	}
	public void setReciver(Reciver reciver) {
		this.reciver = reciver;
	}
	public String getPurpes() {
		return purpes;
	}
	public void setPurpes(String purpes) {
		this.purpes = purpes;
	}
	public double getOrginalAmount() {
		return orginalAmount;
	}
	public void setOrginalAmount(double orginalAmount) {
		this.orginalAmount = orginalAmount;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
	
}

