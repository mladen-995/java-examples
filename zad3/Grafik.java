package zad3;

import java.awt.*;



public abstract class Grafik extends Frame implements Runnable {
	private final int dt=100;
	private boolean radi = false;
	protected Thread nit = new Thread(this);
	
	public void run(){
		try{
			while(!nit.interrupted()){
				synchronized(this) {
					while (!radi) wait();
					radi();
				}
				Thread.sleep(dt+(int)(Math.random()*100));
			}
		}catch(InterruptedException g){}
	}
	
	public synchronized void pocni(){
		radi = true;
		nit.start();
	}
   /* public synchronized void kreni(){
    	radi = true;
       notify();
    }*/
    public void stani(){
    	nit.interrupt();
    	radi = false;
    }
	public abstract void radi();
	
	public abstract void paint(Graphics g);

}
