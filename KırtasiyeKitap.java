package Object.Hom2.com;

public class KýrtasiyeKitap extends IstDukkanlar{
	Tur kTur;
	boolean ikinciEl;
	boolean imzaGunu;
	
	@Override
	public void Acilis() {
		// TODO Auto-generated method stub
		System.out.println("Kitapçýlar 10:00 da açýlýr.");
	}
	
	
	void FisBilgi(int kod ,String tur) {
		System.out.println("Fiþ bilgisi: satýlan ürün kodu: " + kod + " urunun turu: " + tur);
	}
	
}
