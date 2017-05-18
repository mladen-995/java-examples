package zad2;

public abstract class Uredjivac extends Thread{
    private int[] niz;
    private int duz;
	private Uporedjivac u;
	private final int dt=100;
	private boolean radi = false;
	
	public Uredjivac(int[] a, int n, Uporedjivac uu){
		this.niz=a;
		this.duz=n;
		this.u=uu;

	}
	
	public void run(){
		try{
			while(!interrupted()){
				synchronized(this) {
					while (!radi) wait();
					uredi(niz, duz, u);
				}
				sleep(dt+(int)(Math.random()*100));
			}
		}catch(InterruptedException g){}
	}
	
	public synchronized void pocni(){
		radi = true;
		start();
	}
    public synchronized void kreni(){
    	radi = true;
       notify();
    }
    public void stani(){
    	interrupt();
    	radi = false;
    }
	public abstract void uredi(int[] niz, int n, Uporedjivac u);
	
	
}