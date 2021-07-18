

package com.example.livraison.Fournisseur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.livraison.Colis.Colis;


@Service
public class FournisseurService {

	

	@Autowired
	private final FournisseurRepository fournisseurRepository ;
	
	
	@Autowired  
	public FournisseurService (FournisseurRepository fournisseurRepository)
	{ this.fournisseurRepository = fournisseurRepository ; }
	
	

	//Get Fournisseur By Id
	public Optional<Fournisseur> findById(Long id) {
		return fournisseurRepository.findById(id);
	}	
	

	
	//save
	public Fournisseur saveFournisseur(Fournisseur fournisseur )
	{
		return fournisseurRepository.save(fournisseur);
    }
	
	
	
	//update
	public Fournisseur updateFournisseur(Fournisseur fournisseur)
	{
	  return fournisseurRepository.save(fournisseur) ;
	}
	
	
	
	//lister les F 
	public List<Fournisseur> findAllFournisseurs()
	{
		return fournisseurRepository.findAll();	
	}
	
	
	
	//supprimer un F
	public void deleteFournisseur(Long id)
	{
		fournisseurRepository.deleteById(id) ;
	}
	

}
