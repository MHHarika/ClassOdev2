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
		System.out.println("D�kkanlar sabah 09:00 da a��l�r.");
	}
	
	public void Kapanis() {
		System.out.println("D�kkanlar ak�am 18:00 da kapan�r.");
	}
	
	double Kira() {
		System.out.println("Kira tutar�: ");
		kira = true;
		return kiraBedeli + emlakVergi;
	}
	
	
	double Odeme() {
		return satisBedeli ;
	}
	
	 double sigortaHesap() {
		 System.out.println("sigorta tutar�:");
		return   maas * katsayi;
	}
	
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�e�itli d�kkan giderleri : Kira bedeli " + Kira() + " Sigorta giderleri: " + sigortaHesap();
	}
}
