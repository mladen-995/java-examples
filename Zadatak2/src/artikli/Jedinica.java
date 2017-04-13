package artikli;
import greske.Greske;

public class Jedinica {
	private String oznaka;
	
	public Jedinica(String oznaka) throws Greske {
		if (this.dozvoljenaOznaka(oznaka))
			this.oznaka=oznaka;
		else
			throw new Greske(Greske.NEPRAVILNA_OZNAKA);
	}
	
	private boolean dozvoljenaOznaka(String testiraj) {
		if (testiraj=="kom" || testiraj=="l" || testiraj=="m" || testiraj=="kg")
			return true;
		else
			return false;
	}
	
	public String toString(){
		return oznaka;
	}
}
