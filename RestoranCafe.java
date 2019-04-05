package Object.Hom2.com;

public class RestoranCafe extends IstDukkanlar {
	boolean ticket;
	boolean selfServis;
	String yemekler;
	String tatlilar;
	String icecekler;
	String baslangiclar;
	int bahsis;
	double ticketKdv;
	
	@Override
	public void Acilis() {
		// TODO Auto-generated method stub
		System.out.println("Cafeler sabah 07:00 da açýlýr.");
	}
	
	@Override
	double Odeme() {
		// TODO Auto-generated method stub
		if (ticket) {
			return satisBedeli + ticketKdv;
		}else {
		return satisBedeli ;}
	}
		
	void SelfServis() {
		if (selfServis) { 
			System.out.println("Bahsis ödemene gerek yok.Self servis hizmet veriliyor.");
		}else {
			System.out.println("Bahþiþ býraksan fena olmaz.Býrakýlan bahþiþ: " + bahsis);
		}
	}}
	

