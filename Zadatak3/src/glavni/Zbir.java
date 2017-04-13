package glavni;

import greske.Greske;

public class Zbir extends Binarni {

	public Zbir(Izraz a, Izraz b){
		super('+', a, b);
	}
	
	@Override
	public double vrednostRealnogTipa() throws Greske{
		return this.dohvatiA().vrednostRealnogTipa()+this.dohvatiB().vrednostRealnogTipa();
	}
	
	@Override
	public Izraz stvaranjeIzvodaPoPromenljivoj(Promenljiva diff){
		return new Zbir(this.dohvatiA().stvaranjeIzvodaPoPromenljivoj(diff), this.dohvatiB().stvaranjeIzvodaPoPromenljivoj(diff));
	}
}
