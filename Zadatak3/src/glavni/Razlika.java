package glavni;

import greske.Greske;

public class Razlika extends Binarni{
	
	public Razlika(Izraz a, Izraz b){
		super('-', a, b);
	}
	
	@Override
	public double vrednostRealnogTipa() throws Greske{
		return this.dohvatiA().vrednostRealnogTipa()-this.dohvatiB().vrednostRealnogTipa();
	}
	
	@Override
	public Izraz stvaranjeIzvodaPoPromenljivoj(Promenljiva diff){
		return new Razlika(this.dohvatiA().stvaranjeIzvodaPoPromenljivoj(diff), this.dohvatiB().stvaranjeIzvodaPoPromenljivoj(diff));
	}
}
