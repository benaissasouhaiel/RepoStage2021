package com.example.livraison.Colis;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.livraison.Colis.Colis;

@Repository
public interface ColisRepository extends JpaRepository< Colis , Long > {

 // List<Colis> findByEtat(String Etat);


}
   