package Object.Hom2.com;

public class K�rtasiyeKitap extends IstDukkanlar{
	Tur kTur;
	boolean ikinciEl;
	boolean imzaGunu;
	
	@Override
	public void Acilis() {
		// TODO Auto-generated method stub
		System.out.println("Kitap��lar 10:00 da a��l�r.");
	}
	
	
	void FisBilgi(int kod ,String tur) {
		System.out.println("Fi� bilgisi: sat�lan �r�n kodu: " + kod + " urunun turu: " + tur);
	}
	
}
