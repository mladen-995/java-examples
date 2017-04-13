package glavni;
import greske.Greske;

public class Glavni {

	public static void main(String[] args) {
		Promenljiva x = new Promenljiva('x'); 
		Konstanta c1 = new Konstanta(3);
		Zbir z1 = new Zbir(x, c1);
		
		Konstanta c2 = new Konstanta(2);
		Razlika r1 = new Razlika(x, c2);
		
		Konstanta c3 = new Konstanta(1);
		Zbir z2 = new Zbir(x, c3);
		
		Proizvod donji = new Proizvod(r1, z2);
		
		Kolicnik formula = new Kolicnik(z1, donji);
		Izraz prvi_izvod = formula.stvaranjeIzvodaPoPromenljivoj(x);
		
		System.out.println(formula);
		System.out.println(prvi_izvod);
	}

}
