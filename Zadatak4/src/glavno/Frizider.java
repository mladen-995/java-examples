package glavno;
import greske.Greske;

public class Frizider {
	private Sastojak[] sastojci;
	int kapacitet, brojSast;
	
	public Frizider(int kapacitet){
		this.kapacitet=kapacitet;
		this.brojSast=0;
		this.sastojci = new Sastojak[kapacitet];
	}
	
	public Frizider dodaj(Sastojak s) throws Greske{
		if (this.kapacitet==this.brojSast)
			throw new Greske(Greske.FRIDZ_PUN);
		this.sastojci[this.brojSast++]= s;
		return this;
	}
	
	public Sastojak izvadi(int poz) throws Greske{
		if (poz<0 || poz>this.brojSast-1)
			throw new Greske(Greske.NEMA_INDEX);
		
		Sastojak s = this.sastojci[poz];
		for(int i=poz; i<this.brojSast-1; i++)
			this.sastojci[i]=this.sastojci[i+1];
		return s;
	}
	
	public double cenaUkupno(){
		double S=0;
		for(int i=0; i<this.brojSast; i++)
			S += this.sastojci[i].ukupnaCena();
		return S;
	}
	public double kalorijaUkupno(){
		double S=0;
		for(int i=0; i<this.brojSast; i++)
			S += this.sastojci[i].ukupnaKalorijskaVr();
		return S;
	}
	
	@Override
	public String toString(){
		String S = "Kapacitet: "+this.kapacitet+"\nPopunjeno: "+this.brojSast;
		for(int i=0; i<this.brojSast; i++)
			S += this.sastojci[i];
		return S;
	}
}
