package glavno;
import greske.Greske;

public class GlavniP {

	public static void main(String[] args) {
		try {
			Frizider f = new Frizider(10);
			Sastojak novi = new CvrstSastojak("Sir", 2, 4, 25.3, 80);
			Sastojak novi2 = new TecniSastojak("Mleko", 2, 4, 25.3, 80);
			Sastojak novi3 = new CvrstSastojak("Kobasica", 2, 4, 25.3, 80);
			
			f.dodaj(novi).dodaj(novi2).dodaj(novi3);
			
			System.out.println(f);
		}
		catch (Greske g){
			System.out.println(g);
		}
	}

}
