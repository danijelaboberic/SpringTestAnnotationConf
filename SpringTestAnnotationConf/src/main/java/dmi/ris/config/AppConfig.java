package dmi.ris.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import dmi.ris.app.Adresa;
import dmi.ris.app.Boraviste;
import dmi.ris.app.Prebivaliste;


@Configuration
@ComponentScan(basePackages="dmi.ris.app")
@PropertySource("classpath:application.properties")
public class AppConfig {
	
	  @Bean("prebivaliste")
	  public Adresa getPrebivaliste(@Value("${prebivaliste.adresa}") String adresa,@Value("${prebivaliste.broj}") int broj){
		 return new Prebivaliste(adresa,broj);
	  }
	  @Bean("boraviste")
	  public Adresa getBoraviste(@Value("${boraviste.adresa}") String adresa,@Value("${boraviste.broj}") int broj){
			return new Boraviste(adresa,broj);
	  }
}
