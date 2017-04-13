package greske;

public class Greske extends Exception {

	private String s = "NIJE DOZVOLJENO DELJENJE SA NULOM";
	
	@Override
	public String toString(){
		return "\n***"+s+"***\n";
	}
}
