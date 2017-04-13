package artikli;
import greske.Greske;

public class Skladiste {
	private String naziv, adresa;
	private Niz niz_zapisa;
	
	public Skladiste (String naziv, String adresa) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.niz_zapisa = new Niz(5);
	}
	
	public Skladiste dodaj(Zapis z) throws Greske {
		for(int i=0; i<this.niz_zapisa.brElemenata(); i++){
			if (this.niz_zapisa.dohvati(i).dohvatiArtikal().jednaki(z.dohvatiArtikal())){
				throw new Greske(Greske.POSTOJI_ARTIKAL);
			}
		}
		
		this.niz_zapisa.dodaj(z);
		return this;
	}
	
	public Zapis dohvatiNaziv(String naziv) throws Greske {
		int poz=-1;
		for(int i=0; i<this.niz_zapisa.brElemenata(); i++){
			if (this.niz_zapisa.dohvati(i).dohvatiArtikal().dohvatiNaziv() == naziv){
				poz=i;
				break;
			}
		}
		if (poz==-1)
			throw new Greske(Greske.NEPOSTOJI_IME_ARTIKLA);
		return this.niz_zapisa.dohvati(poz);
	}
	
	public double ukupnaVr() throws Greske {
		double S=0;
		for(int i=0; i<this.niz_zapisa.brElemenata(); i++)
			S += this.niz_zapisa.dohvati(i).vrednost();
		return S;
	}
	
	
	@Override
	public String toString(){
		return this.naziv+"\n"+this.adresa+"\n"+this.niz_zapisa;
	}
}
