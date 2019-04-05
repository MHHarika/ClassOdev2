package Object.Hom2.com;

public class IstDukkanlar {
	String dukkanAdi;
	String semti;
	boolean zincir;
	int calismaSaatleri;
	int emlakVergi;
	int calisanSayisi;
	boolean kira;
	int kiraBedeli;
	boolean intAlisverisi;
	int satisBedeli;
	double maas;
	double katsayi;
	
	public void Acilis() {
		System.out.println("Dükkanlar sabah 09:00 da açýlýr.");
	}
	
	public void Kapanis() {
		System.out.println("Dükkanlar akþam 18:00 da kapanýr.");
	}
	
	double Kira() {
		System.out.println("Kira tutarý: ");
		kira = true;
		return kiraBedeli + emlakVergi;
	}
	
	
	double Odeme() {
		return satisBedeli ;
	}
	
	 double sigortaHesap() {
		 System.out.println("sigorta tutarý:");
		return   maas * katsayi;
	}
	
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Çeþitli dükkan giderleri : Kira bedeli " + Kira() + " Sigorta giderleri: " + sigortaHesap();
	}
}
