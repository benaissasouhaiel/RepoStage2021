package com.example.livraison.Colis;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
//import javax.persistence.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ColisRepository extends JpaRepository< Colis , Long > {

	
	@Query("SELECT s FROM Colis s WHERE s.etat LIKE '%' || :etat || '%' ")
	  public List<Colis> search(@Param("etat") String etat);
	
	
	
	@Query(value="SELECT c.etat , r.revtstmp FROM revinfo r , Colis_aud c WHERE c.reference = :reference and c.rev = r.rev", nativeQuery = true)
	 public List<HistoStateOnly> getColisAud(Long reference);
	
	 public static interface HistoStateOnly {

	     String getEtat();

	     Long getRevtstmp();

	  }

}
