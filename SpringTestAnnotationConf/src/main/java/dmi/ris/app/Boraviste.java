package dmi.ris.app;

public class Boraviste extends Adresa {
	public Boraviste(String ulica, int broj) {
		super(ulica, broj);	
	}

	@Override
	String ispisi() {
		return "Uglavnom me mozete naci na adresi "+this.ulica+"/"+this.broj+".";
			
	}
	
}
