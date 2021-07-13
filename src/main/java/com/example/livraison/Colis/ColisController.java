package com.example.livraison.Colis;







import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.livraison.Fournisseur.FournisseurService;


@Controller
@RestController
//@CrossOrigin("*")
@RequestMapping 
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
    public Colis updateColis( @RequestBody  Colis colis )
   {  
	   return colisService.updateColis(colis);
   }
   
    
    
   //delete
    @DeleteMapping("deleteColis")
    public String deleteColis(@RequestParam Long reference)
     {
    	colisService.deleteColis(reference);
    	return "Colis Deletetd !" ;
     }
 
    
 
   
    //findColisCreé
    @GetMapping("/search/{etat}")
	  
	  @ResponseBody 
	  public  List<Colis> search(@PathVariable(value = "etat") String etat) {
		  List<Colis> list =  colisService.search(etat); 
		  return list; 
	 }
  
    
    
    //count Colis By Etat
       @GetMapping("/count/{etat}")
        @ResponseBody
        public int countByEtat(@PathVariable(value = "etat") String etat )
          {
	             return colisService.countByEtat(etat) ;
          }
 
 
}

	
	
	