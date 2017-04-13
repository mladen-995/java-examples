package glavno;

public class Element {
	private char[] simbol;
	private int redniBr;
	
	public Element(char[] simbol, int redniBr){
		this.simbol = simbol;
		this.redniBr = redniBr;
	}
	
	public char[] dohvatiSimbol(){
		return this.simbol;
	}
	public int dohvatiRedniBr(){
		return this.redniBr;
	}
	
	@Override
	public String toString(){
		return ""+String.valueOf(this.simbol);
	}
}
