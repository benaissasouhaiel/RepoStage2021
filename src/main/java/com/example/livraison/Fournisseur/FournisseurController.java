package com.example.livraison.Fournisseur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import com.example.livraison.Colis.Colis;
import com.example.livraison.Colis.ColisService;




@Controller
@RestController
@CrossOrigin("*")
@RequestMapping 
public class FournisseurController {
	
	
	@Autowired 
	private final FournisseurService fournisseurService ;

	//@Autowired 
	//private final ColisService colisService ;
	


	@Autowired  
	public FournisseurController  (FournisseurService fournisseurService)
	{ this.fournisseurService = fournisseurService ;  }
	
	
	
//find by id	
	@RequestMapping("findFournisseurById")   
	@ResponseBody
	public Optional<Fournisseur> findById(Long id)
	{
		return fournisseurService.findById(id);
		
	}


    //save 
   @PostMapping(value="saveFournisseur")	
public  Fournisseur saveFournisseur (@RequestBody  Fournisseur  fournisseur  )
{
 System.out.println("  fournisseur save works properly ! ") ; 
 fournisseurService.saveFournisseur(fournisseur);
 return  fournisseur ;
}


//find all
@GetMapping(value="getAllFournisseurs")
public List<Fournisseur> findAllFournisseurs()
{
  return fournisseurService.findAllFournisseurs() ;
}


//update
@PutMapping("updatefournisseur")
public  Fournisseur updateFournisseur( @RequestBody   Fournisseur fournisseur )
{  
   return fournisseurService.updateFournisseur( fournisseur);
}



//delete
@DeleteMapping("deleteFournisseur")
public String deleteFournisseur(@RequestParam Long id)
 {
	fournisseurService.deleteFournisseur(id);
	return " fournisseur Deletetd !" ;
 }





}



