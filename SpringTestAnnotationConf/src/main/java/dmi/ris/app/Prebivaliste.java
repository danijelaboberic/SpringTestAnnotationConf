package dmi.ris.app;

public class Prebivaliste extends Adresa {

	public Prebivaliste(String ulica, int broj) {
		super(ulica, broj);	
	}

	@Override
	String ispisi() {
		return "Adresa u licnoj karti mi je "+this.ulica+"/"+this.broj+".";	
	}
}
