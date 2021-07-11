package com.example.livraison.Colis;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import javax.persistence.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.livraison.Colis.Colis;

@Repository
public interface ColisRepository extends JpaRepository< Colis , Long > {

	
	@Query("SELECT s FROM Colis s WHERE s.etat LIKE '%' || :etat || '%' ")
	  public List<Colis> search(@Param("etat") String etat);	
}
