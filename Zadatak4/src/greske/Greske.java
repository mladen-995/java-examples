package greske;

public class Greske extends Exception{
	public final static int NAPUNJENO=0, FRIDZ_PUN=1, NEMA_INDEX=2;
	
	private final static String[] poruke = {
			"SASTOJAK JE PREPUNJEN",
			"FRIZIDER JE PUN",
			"NAVEDENA POZICIJA NIJE VALIDNA"
	};
	
	private int sifra;
	
	public Greske(int sifra){
		this.sifra=sifra;
	}
	
	@Override
	public String toString(){
		return "\n***"+poruke[sifra]+"***\n";
	}
}
