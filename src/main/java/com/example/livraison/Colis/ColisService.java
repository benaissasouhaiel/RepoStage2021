package com.example.livraison.Colis;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.livraison.Colis.Colis;
import com.example.livraison.Colis.ColisRepository;


@Service
public class ColisService {

	
	@Autowired
	private final ColisRepository colisRepository ;
	
	
	@Autowired  
	public ColisService (ColisRepository colisRepository)
	{ this.colisRepository = colisRepository ; }
	
	//save
	public Colis saveColis(Colis colis )
	{
		return colisRepository.save(colis);
		
	}
	
	//update
	public Colis updateColis(Colis colis )
	{
	  return colisRepository.save(colis) ;
	}
	
	//lister les colis 
	public List<Colis> findAllColis()
	{
		return colisRepository.findAll();
		
	}
	
	//supprimer un colis 
	public void deleteColis(Long Réference)
	{
	colisRepository.deleteById(Réference) ;
	}
	
	
	
	
/**
	//lister les colis 
	 public Optional  List<Colis> findByEtat(String Etat);
	{
		return colisRepository.findByEtat(Etat);
		
    }

*/
}
