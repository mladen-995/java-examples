package glavni;

public abstract class Binarni extends Izraz {
	private char operacija;
	private Izraz a, b;
	
	public Binarni(char operacija, Izraz a, Izraz b){
		this.operacija=operacija;
		this.a=a;
		this.b=b;
	}
	
	public Izraz dohvatiA(){
		return this.a;
	}
	public Izraz dohvatiB(){
		return this.b;
	}
	
	@Override
	public String toString() {
		return "(" + this.a.toString() + this.operacija + this.b.toString() + ")";
	}
}
