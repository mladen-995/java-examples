package glavni;

public class Promenljiva extends Izraz {
	private char ime;
	private double vrednost=0;
	
	public Promenljiva(char ime){
		this.ime=ime;
	}
	public Promenljiva(char ime, double vrednost){
		this.ime=ime;
		this.vrednost=vrednost;
	}
	
	public Promenljiva promeniVrednost(double vrednost){
		this.vrednost=vrednost;
		return this;
	}
	public char dohvatiIme(){
		return this.ime;
	}
	@Override
	public double vrednostRealnogTipa(){
		return this.vrednost;
	}
	@Override
	public Izraz stvaranjeIzvodaPoPromenljivoj(Promenljiva diff){
		if (this.ime==diff.dohvatiIme())
			return new Konstanta(1);
		else
			return new Konstanta(0);
	}
	@Override
	public String toString(){
		return ""+this.ime;
	}
}
