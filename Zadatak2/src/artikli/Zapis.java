package artikli;

public class Zapis implements Vrednost {
	private Artikal artikal;
	private int kolicina;
	private double cena;
	
	public Zapis(Artikal a, int kolicina, double cena) {
		this.artikal = a;
		this.kolicina = kolicina;
		this.cena = cena;
	}
	
	
	public Artikal dohvatiArtikal(){
		return this.artikal;
	}
	public int dohvatiKoliciinu(){
		return this.kolicina;
	}
	public double dohvatiCenu(){
		return this.cena;
	}
	
	public Zapis promeniCenu(double novacena){
		this.cena = novacena;
		return this;
	}
	public Zapis promeniKolicinu(int novakol){
		this.kolicina = novakol;
		return this;
	}
	
	@Override
	public double vrednost(){
		return this.kolicina*this.cena;
	}
	
	@Override
	public String toString(){
		return "("+this.artikal+", "+this.kolicina+", "+this.artikal.dohvatiJedinicu()+", "+this.cena+", "+this.vrednost()+")";
	}
}
