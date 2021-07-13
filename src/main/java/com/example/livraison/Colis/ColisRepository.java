package com.example.livraison.Colis;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ColisRepository extends JpaRepository< Colis , Long > {

	
	@Query("SELECT s FROM Colis s WHERE s.etat LIKE '%' || :etat || '%' ")
	  public List<Colis> search(@Param("etat") String etat);	
	
	
  @Query("SELECT count(s) FROM Colis s WHERE s.etat LIKE '%' || :etat || '%' ")

	 public int  countByEtat(@Param("etat") String etat);
 
}
