package Object.Hom2.com;

public class ProgramDukkan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestoranCafe cafe = new RestoranCafe();
		cafe.dukkanAdi= "Mado";
		cafe.semti = "�i�li";
		cafe.calisanSayisi= 10;
		cafe.emlakVergi= 1000;
		cafe.Acilis();
		cafe.selfServis= true;
		System.out.println(cafe.toString());
		cafe.SelfServis();
		
		System.out.println("********");
		
		Tur Kitapturu = new Tur();
		Kitapturu.urunKodu= 12334;
		Kitapturu.kategori = "kitap";
		
		K�rtasiyeKitap kitapci = new K�rtasiyeKitap();
		kitapci.kTur = Kitapturu;
		kitapci.dukkanAdi = "Zero";
		kitapci.semti = "Taksim";
		kitapci.calisanSayisi = 5;
		kitapci.Acilis();
		kitapci.FisBilgi(Kitapturu.urunKodu, Kitapturu.kategori);
		kitapci.kiraBedeli = 4000;
		kitapci.emlakVergi = 1000;
		System.out.println(kitapci.Kira());
		kitapci.maas = 2000;
		kitapci.katsayi = 0.15;
		System.out.println(kitapci.sigortaHesap());
		kitapci.toString();
		
		System.out.println("**********");
		
		Tur Tesktilturu = new Tur();
		Tesktilturu.kategori = "g�mlek";
		Tesktilturu.urunKodu = 7890;
		
		TekstilUrunMagazas� magaza = new TekstilUrunMagazas�();
		magaza.dukkanAdi = "be�ikta� butik";
		magaza.semti = "Be�ikta�";
		magaza.calisanSayisi = 8;
		magaza.Kapanis();
		magaza.TeksTur = Tesktilturu;
		magaza.intAlisverisi=true;
		magaza.indirim = true;
		magaza.indirimOrani = 0.20 ;
		magaza.satisBedeli = 100;
		System.out.println(magaza.Odeme());
		magaza.degisim = true;
		magaza.DegisimS�resi();
		magaza.FisBilgi(Tesktilturu.urunKodu,Tesktilturu.kategori );
		
		
		
		
		
		
	}

}
