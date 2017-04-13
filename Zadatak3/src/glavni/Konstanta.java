package glavni;

public class Konstanta extends Izraz {
	private final double vrednost;
	
	public Konstanta(double vr){
		this.vrednost = vr;
	}
	
	@Override
	public double vrednostRealnogTipa(){
		return this.vrednost;
	}
	
	@Override
	public Izraz stvaranjeIzvodaPoPromenljivoj(Promenljiva diff){
		return new Konstanta(0);
	}
	
	@Override
	public String toString(){
		return ""+this.vrednost;
	}
}
