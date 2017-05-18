package zad2;

public class Izbor extends Uredjivac {

	public Izbor(int[] a, int n, Uporedjivac uu) {
		super(a, n, uu);
		// TODO Auto-generated constructor stub
	}

	public void uredi(int[] niz, int l, Uporedjivac u) {
		int n = (l>niz.length) ? niz.length : l;
		for (int i=0; i<n-1; i++)
			for (int j=i+1; j<n; j++)
				if (u.ispred(niz[j],niz[i])){
					int p = niz[j];
					niz[j]=niz[i];
					niz[i]=p;
				}
			

	}

}
