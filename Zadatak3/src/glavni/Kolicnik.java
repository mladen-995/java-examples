package glavni;
import greske.Greske;

public class Kolicnik extends Binarni {

	public Kolicnik(Izraz a, Izraz b){
		super('/', a, b);
	}
	
	@Override
	public double vrednostRealnogTipa() throws Greske{
		if (this.dohvatiB().vrednostRealnogTipa()==0.0)
			throw new Greske();
		return this.dohvatiA().vrednostRealnogTipa()/this.dohvatiB().vrednostRealnogTipa();
	}
	
	@Override
	public Izraz stvaranjeIzvodaPoPromenljivoj(Promenljiva diff){
		return new Kolicnik(new Razlika(new Proizvod(this.dohvatiA().stvaranjeIzvodaPoPromenljivoj(diff), this.dohvatiB()), new Proizvod(this.dohvatiA(), this.dohvatiB().stvaranjeIzvodaPoPromenljivoj(diff))), new Proizvod(this.dohvatiB(), this.dohvatiB()));
	}
}
