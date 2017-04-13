package artikli;
import greske.Greske;

public abstract class Artikal {
	private String naziv;
	private Jedinica jedinica;
	
	public Artikal(String naziv, String jedinica) throws Greske {
		this.jedinica = new Jedinica(jedinica);
		this.naziv = naziv;
	}
	
	public boolean jednaki(Artikal a){
		if (naziv==a.naziv)
			return true;
		else
			return false;
	}
	
	public String dohvatiNaziv(){
		return naziv;
	}
	public Jedinica dohvatiJedinicu(){
		return jedinica;
	}
	
	public String toString(){
		return naziv;
	}
}
