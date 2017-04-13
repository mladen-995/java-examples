package artikli;
import greske.Greske;

public class Glavni {

	public static void main(String[] args) {
		Skladiste skladiste = new Skladiste("adresa","naziv");
		
		try{
			Mleko mleko = new Mleko();
			Secer secer = new Secer();
			Mleko mleko_2 = new Mleko();
			
			Zapis zapis_mleko = new Zapis(mleko, 10, 10);
			Zapis zapis_secer = new Zapis(secer, 10, 10);
			Zapis zapis_mleko_2 = new Zapis(mleko_2, 20, 20);
			
			skladiste.dodaj(zapis_mleko);
			skladiste.dodaj(zapis_secer);
			/////////////////////////////////////////
			//ovo se nece dodati jer vec postoji mleko
			skladiste.dodaj(zapis_mleko_2);
			
			double vrednost = skladiste.ukupnaVr();
			System.out.println("Ukupna vrednost je: "+ vrednost);
			System.out.println(skladiste);
		}
		catch(Greske g){
			System.out.println(g + "\n");
		}
	}

}
