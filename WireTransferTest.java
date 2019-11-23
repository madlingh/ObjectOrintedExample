package WireTransfer;

public class WireTransferTest {
	public static void main(String []args) {
		
		Sender s = new Sender();
		s.setName("Ata");
		s.setNumID(124);
		s.setPhoneNumber(12346567);
		Reciver r = new Reciver();
		r.setName("Madleen");
		r.setPhoneNumber(1789643);
		Country co = new Country();
		co.name="Oman";
		City ci = new City();
		ci.name="Muscat";
		Curance cu = new Curance();
		cu.name="$";
		WireTransfer w = new WireTransfer();
		w.setOrginalAmount(10000);
		
		w.setReciver(r);
		w.setSender(s);
		
		
		System.out.println(w);
		Sender s2 = new Sender();
		s2.setName("mmm");
		Sender s3 = new Sender();
		s3.setName("mmm");
		System.out.println(s2.equals(s3));
		
	}

}
