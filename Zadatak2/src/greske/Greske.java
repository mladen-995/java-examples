package greske;

public class Greske extends Exception {
	public static int NEPRAVILNA_OZNAKA=0, NEPOSTOJECI_INDEX=1, POSTOJI_ARTIKAL=2, NEPOSTOJI_IME_ARTIKLA=3;
	
	private static String[] poruke = {
			"OZNAKA JEDINICE JE NEISPRAVNA",
			"NEPRAVILAN INDEX",
			"ARTIKAL VEC POSTOJI",
			"ZADATO IME ARTIKLA NE POSTOJI"
	};
	
	private int sifra;
	
	public Greske(int sifra){
		this.sifra=sifra;
	}
	
	public String toString(){
		return "***"+poruke[sifra]+"***";
	}
}
