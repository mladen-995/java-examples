package zad2;

public class Manje implements Uporedjivac {


	
	public boolean ispred(int a, int b) {
		if (a<b) return true;
		return false;
	}

	public boolean jednak(int a, int b) {
		if (a==b) return true;
		return false;
	}

}
