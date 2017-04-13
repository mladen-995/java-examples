package glavno;

public class Jedinjenje {

	private class Elem{
		Element element;
		Elem sledeci=null;
		int brojAtoma;
		Elem(Element element, int brAtoma){
			this.element=element;
			this.brojAtoma=brAtoma;
		}
	}
	
	private Elem prvi = null, poslednji = null;
	
	public Jedinjenje dodajElement(Element e, int br_atoma){
		if (prvi == null){
			prvi = new Elem(e, br_atoma);
		}
		else {
			poslednji.sledeci = new Elem(e, br_atoma);
			poslednji = poslednji.sledeci;
		}
		return this;
	}
	
	@Override
	public String toString(){
		Elem tekuci = prvi;
		String S = "\n*ISPIS*\n";
		while(tekuci != null){
			S += (tekuci.brojAtoma > 1) ? tekuci.element.toString()+tekuci.brojAtoma : tekuci.element.toString();
		}
		return S;
	}
}
