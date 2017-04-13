package glavni;

import greske.Greske;

public abstract class Izraz {

	public abstract double vrednostRealnogTipa() throws Greske;
	public abstract Izraz stvaranjeIzvodaPoPromenljivoj(Promenljiva diff);
	public abstract String toString();
}
