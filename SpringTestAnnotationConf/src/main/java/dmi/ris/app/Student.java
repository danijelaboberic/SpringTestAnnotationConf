package dmi.ris.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String ime;
	
	@Autowired
	@Qualifier("prebivaliste")
	private Adresa prebivaliste;
	
	@Autowired
	@Qualifier("boraviste")
	private Adresa boraviste;
	
   
    public void setIme(String ime) {
		this.ime = ime;
	}


	public void predstaviSe(){
		System.out.println("Zovem se "+ime+".\n "+prebivaliste.ispisi()+"\n "+boraviste.ispisi()+"\n " );
	}
	
	
	

}
