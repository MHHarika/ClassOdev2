package Object.Hom2.com;

public class TekstilUrunMagazasý extends IstDukkanlar {
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
		System.out.println("Magazalar 21:00 da kapanýr.");
	} 
	
	void DegisimSüresi() {
		if(degisim) {
			System.out.println("Degisim süresi 30 gündür.");
		}
	}
	
	 void FisBilgi(int kod ,String tur) {
		System.out.println("Fiþ bilgisi: satýlan ürün kodu: " + kod + " urunun turu: " + tur);
	}
}
