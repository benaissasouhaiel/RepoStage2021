/**package com.example.livraison.Colis;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColisConfig {
	

	@Bean
	CommandLineRunner commandLineRunner (ColisRepository repository)
	{
		return args -> {
			
			 Colis c1 = new Colis (   null, "benothmen" , "Ihcrak" , 111, 
						"gabes" , "gabes" , "gabes ville" ,
						"gabes centre" , 6014 , 1000 , "chéque" ,
						"livraison" , "parfum" , "avant dimanche" ,
						"stocké", "rien" , 2 , 2 , 2 , 2 , 2) ;
			 
			 
			 Colis c3 = new Colis (   null, "khchini" , "hiba" , 111
						, 
						"gabes" , "gabes" , "gabes ville" ,
						"gabes centre" , 6014 , 1000 , "chéque" ,
						"livraison" , "parfum" , "avant dimanche" ,
						"stocké", "rien" , 2 , 2 , 2 , 2 , 2) ;


			 
			 repository.saveAll(List.of(c1 , c3 ));
			 
			 
			 
		};
		
			
		
			
			
		

	

}
}
*/
