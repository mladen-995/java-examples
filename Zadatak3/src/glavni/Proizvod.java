package glavni;

import greske.Greske;

public class Proizvod extends Binarni{

	public Proizvod(Izraz a, Izraz b){
		super('*', a, b);
	}
	
	@Override
	public double vrednostRealnogTipa() throws Greske{
		return this.dohvatiA().vrednostRealnogTipa()*this.dohvatiB().vrednostRealnogTipa();
	}
	
	@Override
	public Izraz stvaranjeIzvodaPoPromenljivoj(Promenljiva diff){
		return new Zbir(new Proizvod(this.dohvatiA().stvaranjeIzvodaPoPromenljivoj(diff), this.dohvatiB()), new Proizvod(this.dohvatiA(), this.dohvatiB().stvaranjeIzvodaPoPromenljivoj(diff)));
	}
}
