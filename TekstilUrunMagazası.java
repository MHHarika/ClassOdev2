package Object.Hom2.com;

public class TekstilUrunMagazas� extends IstDukkanlar {
	Tur TeksTur;
	boolean indirim;
	double indirimOrani;
	String iadeSartlari;
	boolean degisim;
	
	@Override
	double Odeme() {
		// TODO Auto-generated method stub
		if (indirim) {
			return satisBedeli - indirimOrani*satisBedeli;
		}else {
		return satisBedeli;}
	}
	
	@Override
	public void Kapanis() {
		// TODO Auto-generated method stub
		System.out.println("Magazalar 21:00 da kapan�r.");
	} 
	
	void DegisimS�resi() {
		if(degisim) {
			System.out.println("Degisim s�resi 30 g�nd�r.");
		}
	}
	
	 void FisBilgi(int kod ,String tur) {
		System.out.println("Fi� bilgisi: sat�lan �r�n kodu: " + kod + " urunun turu: " + tur);
	}
}
