package zad3;



public class Spirala implements Funkcija {
   private double a;
   private double b;
   private double c;
   
   
	
	public Spirala(double a, double b, double c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}

	public double x(double p) {
		return a*p*Math.cos(b*p+c);
	}

	public double y(double p) {
		return a*p*Math.sin(b*p+c);
	}

}
