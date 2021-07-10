package com.example.livraison.Colis;

import java.time.LocalDate;


import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.livraison.Colis.Colis;


 
@RestController
@CrossOrigin("*")
@RequestMapping //(path ="api/v1/colis" )
public class ColisController {
	
	@Autowired 
	private final ColisService colisService ;


	@Autowired  
	public ColisController (ColisService colisService)
	{ this.colisService = colisService ;  }
	
	
	//save 
   @PostMapping(value="saveColis")	
   public Colis saveColis (@RequestBody Colis colis  )
   {
	 System.out.println(" Colis   save works properly ! ") ; 
	 colisService.saveColis(colis);
	 return colis ;
   }
   
   
   //find all
   @GetMapping(value="getAllColis")
   public List<Colis> findAllColis()
   {
	  return colisService.findAllColis() ;
   }
   
    
   
    @PutMapping("updateColis")
	//@RequestMapping(value="updateColis", method = {RequestMethod.PUT})
    public Colis updateColis( @RequestBody  Colis colis )
   {  
	   return colisService.updateColis(colis);
   }
   
   //delete
    @DeleteMapping("deleteColis")
    public String deleteColis(@RequestParam Long Réference)
     {
    	colisService.deleteColis(Réference);
    	return "Colis Deletetd !" ;
     }
   
   
   
   

	/** 
	
  //find all
    @GetMapping(value="getColisCreé")
    public List<Colis> findByEtat()
    {
 	  return colisService.findByEtat("Creé") ;
 	  
    }
    
	*/
	
}
	
	
	