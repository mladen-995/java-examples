package glavno;
import greske.Greske;

public abstract class Sastojak {
	private class Elem {
		Jedinjenje jed;
		double procenat;
		
		Elem(Jedinjenje jed, double procenat){
			this.jed=jed;
			this.procenat=procenat;
		}
		public String toString(){
			return this.jed+"("+this.procenat+"%)";
		}
	}
	
	private Elem[] opis;
	private int kapacitet, brElem, kolicina;
	private String jedinica, ime;
	private double cena_jedinicne, kalorija_jedinicne;
	
	public Sastojak(String ime, int kapacitet, int kolicina, String jedinica, double cena_jedinicne, double kalorija_jedinicne){
		this.ime=ime;
		this.kapacitet=kapacitet;
		this.kolicina=kolicina;
		this.opis = new Elem[kapacitet];
		this.jedinica=jedinica;
		this.cena_jedinicne=cena_jedinicne;
		this.kalorija_jedinicne=kalorija_jedinicne;
	}
	
	public double ukupnaCena(){
		return this.kolicina*this.cena_jedinicne;
	}
	public double ukupnaKalorijskaVr(){
		return this.kolicina*this.kalorija_jedinicne;
	}
	
	public String dohvatiJedinicu(){
		return this.jedinica;
	}
	
	public Sastojak dodaj(Jedinjenje jed, double proc) throws Greske{
		if (this.brElem==this.kapacitet)
			throw new Greske(Greske.NAPUNJENO);
		
		this.opis[this.brElem++]=new Elem(jed, proc);
		return this;
	}
	
	@Override
	public String toString(){
		String S="\nISPIS\nIme: "+this.ime+"\nKapacitet: "+this.brElem+"\nJedinica: "+this.jedinica+"\nJedinicna cena: "+this.cena_jedinicne+"\nKaorijska jedinicna: "+this.kalorija_jedinicne;
		S+="\n";
		for(int i=0; i<this.brElem; i++)
			S += this.opis[i]+"\n";
		return S;
	}
}
