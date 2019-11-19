package dmi.ris.app;


abstract public class Adresa {

	String ulica;
	int broj;

	public Adresa(String ulica, int broj) {
		this.ulica = ulica;
		this.broj = broj;
	}
	
	abstract String ispisi();

}
