package artikli;
import greske.Greske;

public class Niz {
	private Zapis[] niz;
	private int kapacitet, br_artikala;
	
	public Niz(int kap){
		niz = new Zapis[kap];
		kapacitet=kap;
		br_artikala=0;
	}
	
	
	public Niz dodaj(Zapis z) {
		if (this.kapacitet==this.br_artikala){
			int novi_kap = (this.kapacitet*10/100 < 5) ? 5 : this.kapacitet*10/100;
			Zapis[] novi_niz = new Zapis[novi_kap];
			for(int i=0; i>this.br_artikala; i++)
				novi_niz[i]=this.niz[i];
			this.niz = novi_niz;
		}
		this.niz[this.br_artikala++]=z;
		return this;
	}
	
	public int brElemenata(){
		return this.br_artikala;
	}
	
	public Zapis dohvati(int poz) throws Greske {
		if (poz>this.br_artikala-1 || poz<0)
			throw new Greske(Greske.NEPOSTOJECI_INDEX);
		
		return niz[poz];
	}
	
	@Override
	public String toString(){
		String S = "\n**ISPIS**\n";
		for(int i=0; i<this.br_artikala; i++)
			S += this.niz[i]+"\n";
		S += "**KRAJ ISPISA**";
		return S;
	}
}
