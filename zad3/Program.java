package zad3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Program extends Frame {

	private Platno platno = new Platno();
	
	private TextField x0 = new TextField("-10",4);
	private TextField x1 = new TextField("10",4);
	private TextField y0 = new TextField("-10",4);
	private TextField y1 = new TextField("10",4);
	
	private Button crtaj = new Button("Crtaj");
	private Button prekini = new Button("Prekini");
	
	private Spirala[] spirale = new Spirala[3];
	{
	for(int i=0; i<3; i++){
		spirale[i]= new Spirala(1,1,2.1*i);
	}
	}	
	private Color[] boje = new Color[3];
	{
	boje[0]=new Color(0,0,0);
	boje[1]=new Color(240, 0,0);
	boje[2]=new Color(0, 0, 240);
	}	
	
	
	public Program(){
		super("Spirale");
		setBounds(100,100,400,250);
		popuniProzor();
		setVisible(true);
		
		addWindowListener( new WindowAdapter(){          // za zatvaranje
			public void windowClosing(WindowEvent d){    // na x
				
				dispose();
			}
		});
	}
	
	private void popuniProzor() {
		add(platno,"Center");
		
		Panel p0 = new Panel (new GridLayout(0,1));
		add(p0,"South");
		Panel p1 = new Panel();
	    p0.add(p1,"Center");
	    Panel p2 = new Panel();
	    p0.add(p2, "South");
	    
		
	    p1.add(new Label("x",Label.RIGHT));
	    p1.add(x0); p1.add(x1);
	    p1.add(new Label("y",Label.RIGHT));
	    p1.add(y0); p1.add(y1);
	    
	  
	    p2.add(crtaj);
	    p2.add(prekini);
	    
	    crtaj.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
			platno.postaviOpsegX(Double.parseDouble(x0.getText()),Double.parseDouble(x1.getText()));
			platno.postaviOpsegY(Double.parseDouble(y0.getText()),Double.parseDouble(y1.getText()));
			for(int i=0; i<3; i++){
		
					Grafik g = 
							new Kriva(platno, boje[i], spirale[i], 0, 15.7, 0.03 );
					platno.dodajGrafik(g);
				}
	    	}
	    });
	    
	    prekini.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				platno.prekiniCrt();
	    	}
	    });
	    
	    
	}

	public static void main(String[] args) {
		new Program();

	}

}
