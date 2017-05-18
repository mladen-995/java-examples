package zad2;

import java.awt.*;
import java.awt.event.*;

public class Program extends Frame {

	private final static Uporedjivac raste=new Manje();
	private final static Uporedjivac opada=new Vece();
	
	private int[] niz = new int[100];
	private Uredjivac trUredjivac;
	private int n=0;
	
	private TextArea prikaz = new TextArea();
	private TextField duz = new TextField ("10", 4);
	
	
	private CheckboxGroup grp = new CheckboxGroup();
	private Checkbox r = new Checkbox("raste", grp, true);
	private Checkbox o = new Checkbox("opada", grp, false);
	
	private Button napuni = new Button("Napuni");
	private Button uredi = new Button("Uredi");
	private Button prekini = new Button("Prekini");
	
	
	private void puni(){
		n = Integer.parseInt(duz.getText());
		for (int i=0; i<n; i++){
			niz[i] = (int) (Math.random()*10);
		}
	}
	private void prikazi(){
		StringBuilder s = new StringBuilder();
		for (int i=0; i<n; i++){
			s.append(niz[i]);
			if ((i+1)%20==0) s.append("\n");
			else s.append(" ");
		}
		prikaz.setText(s.toString());
	}
	
	private void popuniProzor(){
		
		prikaz.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent d){
				prikazi();
			}
		});
		add(prikaz,"Center");
		
		Panel ploca = new Panel (new GridLayout(0,1));
		add(ploca, "South");
		Panel p2 = new Panel();
		ploca.add(p2,"Center");
		p2.add(new Label("duz:", Label.RIGHT));
		p2.add(duz);
		p2.add(r);
		p2.add(o);
		
		
		
		Panel p3 = new Panel();
		ploca.add(p3,"South");
		
		
		
		
		p3.add(napuni);
		
		
		
		napuni.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				puni();
				prikazi();
		
			}
			
		});
		p3.add(uredi);
		uredi.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				int l = Integer.parseInt(duz.getText());
				if (r.getState()) trUredjivac= new Izbor(niz, l, raste);
				else trUredjivac= new Izbor(niz, l, opada);
				System.out.println("Kreni");
				trUredjivac.pocni();
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				prikazi();
				prekini.setEnabled(true);
				uredi.setEnabled(false);
			}
			
		});
		p3.add(prekini);
		prekini.setEnabled(false);
		prekini.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				
				trUredjivac.stani();
				prekini.setEnabled(false);
				uredi.setEnabled(true);
			}
			
		});
	}
	
	
	private Program(){
		super("Uredjivanje nizova");
		setBounds(100, 100, 400, 200);
		popuniProzor();
		setVisible(true);
		addWindowListener( new WindowAdapter(){          // za zatvaranje
			public void windowClosing(WindowEvent d){    // na x
				trUredjivac.stani();
				dispose();
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Program();
	
	
	}

}
