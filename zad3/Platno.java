package zad3;

import java.awt.*;
import java.awt.event.*;

public class Platno extends Canvas {

	class Elem{
		Grafik graf;
		Elem sl;
		Elem(Grafik g){
			graf=g;
			sl=null;
		}
	}
	Elem prvi=null, posl=null;
	
	protected double xmin=-10;
	protected double xmax=10;
	protected double ymin=-10;
	protected double ymax=10;
	
	private int sirina;
	private int visina;
	
	public void postaviOpsegX(double x1, double x2){
		xmin=x1; xmax=x2;
	}
	public void postaviOpsegY(double y1, double y2){
		ymin=y1; ymax=y2;
	}
	public int coordX(double x){
		return (int)(((x-xmin)/(xmax-xmin))*(sirina-1));
	}
	public int coordY(double y){
		return (int)(((y-ymin)/(ymax-ymin))*(visina-1));
	}
	
	public void dodajGrafik(Grafik g){
		if (prvi==null) prvi=posl= new Elem(g);
		else {
			posl=posl.sl=new Elem(g);
		}
		g.pocni();
	}
	public void paint(Graphics g){
		this.sirina = getWidth();
		this.visina = getHeight();
		Elem tek = prvi;
		while(tek!=null){
			tek.graf.pocni();
			tek=tek.sl;
		}
	}
	public void prekiniCrt(){
		Elem tek = prvi;
		while(tek!=null){
			tek.graf.stani();
			tek=tek.sl;
		}
	}
	
	

	

	
}
