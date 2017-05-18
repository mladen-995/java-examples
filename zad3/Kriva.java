package zad3;

import java.awt.*;

public class Kriva extends Grafik {
    private Platno platno;
    private Color boja;
    private Funkcija f;
    private double p;
    private double pmin;
    private double pmax;
    private double dp;
    
	
	public Kriva(Platno platno, Color boja, Funkcija f, double p0, double p1, double pp) {
		super();
		this.platno = platno;
		this.boja = boja;
		this.f=f;
		p=pmin = p0;
		pmax = p1;
		dp = pp;
	}

	
		
	

	public void paint(Graphics g) {
	if (g!=null) g.setColor(boja);
		
		while(p<=pmax && !Thread.interrupted()){
			int x0 = platno.coordX(f.x(p));
			int y0 = platno.coordY(f.y(p));
			p+=dp;
			int x1 = platno.coordX(f.x(p));
			int y1 = platno.coordY(f.y(p));
			g.drawLine(x0, y0, x1, y1);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				super.stani();
			}
			
		}
		
	}





	public void radi() {
		Graphics g=platno.getGraphics();
		paint(g);
	}

}
