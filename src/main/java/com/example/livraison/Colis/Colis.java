package com.example.livraison.Colis;



import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import com.example.livraison.Colis.Enum.Etat;
import com.example.livraison.Colis.Enum.Service ;
import com.example.livraison.Fournisseur.Fournisseur;
import com.example.livraison.Colis.Enum.ModePaiement;

@Entity
@Table
public class Colis {
	
	
	@Id
@SequenceGenerator(
		name = "colis_sequence",
		sequenceName = "colis_sequence",
        allocationSize = 1 )
	
@GeneratedValue (strategy = GenerationType.SEQUENCE , 
               	generator = "colis_Sequence")
	public Long   reference ; 
	
	
	public String nom_c ;
	public String prenom_c ;
	public int tel_c_1;
	public int tel_c_2;
	public LocalDateTime dateCreation = LocalDateTime.now();
	public String adresse ; 
	public String gouvernera ; 
	public String delegation ;
	public String localité;
	public int code_postale ; 
	public int cod ;
	
	@Enumerated(EnumType.STRING)
	public ModePaiement mode_paiement; 
	
	@Enumerated(EnumType.STRING)
	public Service  service  ;
	
	
	public String designation  ;
	public String remarque ;
	
	
	@Enumerated(EnumType.STRING)
	public Etat  etat ;
	
	public String anomalie ;
	public int nb_p ;
	public int longeur ;
	public int largeur ;
	public int hauteur ;
	public int poids ;
	

    @ManyToOne
    public Fournisseur fournisseur ;
	
	public Colis() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getReference() {
		return reference;
	}


	public void setReference(Long reference) {
		this.reference = reference;
	}


	public Fournisseur getFournisseur() {
		return fournisseur;
	}


	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}


	public Colis(Long reference, String nom_c, String prenom_c, int tel_c_1, int tel_c_2, LocalDateTime dateCreation,
			String adresse, String gouvernera, String delegation, String localité, int code_postale, int cod,
			ModePaiement mode_paiement, Service service, String designation, String remarque, Etat etat,
			String anomalie, int nb_p, int longeur, int largeur, int hauteur, int poids, Fournisseur fournisseur) {
		super();
		this.reference = reference;
		this.nom_c = nom_c;
		this.prenom_c = prenom_c;
		this.tel_c_1 = tel_c_1;
		this.tel_c_2 = tel_c_2;
		this.dateCreation = dateCreation;
		this.adresse = adresse;
		this.gouvernera = gouvernera;
		this.delegation = delegation;
		this.localité = localité;
		this.code_postale = code_postale;
		this.cod = cod;
		this.mode_paiement = mode_paiement;
		this.service = service;
		this.designation = designation;
		this.remarque = remarque;
		this.etat = etat;
		this.anomalie = anomalie;
		this.nb_p = nb_p;
		this.longeur = longeur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.poids = poids;
		this.fournisseur = fournisseur;
	}





	public String getNom_c() {
		return nom_c;
	}


	public void setNom_c(String nom_c) {
		this.nom_c = nom_c;
	}


	public String getPrenom_c() {
		return prenom_c;
	}


	public void setPrenom_c(String prenom_c) {
		this.prenom_c = prenom_c;
	}


	public int getTel_c_1() {
		return tel_c_1;
	}


	public void setTel_c_1(int tel_c_1) {
		this.tel_c_1 = tel_c_1;
	}


	public int getTel_c_2() {
		return tel_c_2;
	}


	public void setTel_c_2(int tel_c_2) {
		this.tel_c_2 = tel_c_2;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getGouvernera() {
		return gouvernera;
	}


	public void setGouvernera(String gouvernera) {
		this.gouvernera = gouvernera;
	}


	public String getDelegation() {
		return delegation;
	}


	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}


	public String getLocalité() {
		return localité;
	}


	public void setLocalité(String localité) {
		this.localité = localité;
	}


	public int getCode_postale() {
		return code_postale;
	}


	public void setCode_postale(int code_postale) {
		this.code_postale = code_postale;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}



	public ModePaiement getMode_paiement() {
		return mode_paiement;
	}



	public void setMode_paiement(ModePaiement mode_paiement) {
		this.mode_paiement = mode_paiement;
	}



	public Service getService() {
		return service;
	}



	public void setService(Service service) {
		this.service = service;
	}



	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getRemarque() {
		return remarque;
	}


	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}


	public Etat getEtat() {
		return etat;
	}


	public void setEtat(Etat etat) {
		this.etat = etat;
	}


	public String getAnomalie() {
		return anomalie;
	}


	public void setAnomalie(String anomalie) {
		this.anomalie = anomalie;
	}


	public int getNb_p() {
		return nb_p;
	}


	public void setNb_p(int nb_p) {
		this.nb_p = nb_p;
	}


	public int getLongeur() {
		return longeur;
	}


	public void setLongeur(int longeur) {
		this.longeur = longeur;
	}


	public int getLargeur() {
		return largeur;
	}


	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}


	public int getHauteur() {
		return hauteur;
	}


	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}


	public int getPoids() {
		return poids;
	}


	public void setPoids(int poids) {
		this.poids = poids;
	}


	@Override
	public String toString() {
		return "Colis [reference=" + reference + ", nom_c=" + nom_c + ", prenom_c=" + prenom_c + ", tel_c_1=" + tel_c_1
				+ ", tel_c_2=" + tel_c_2 + ", dateCreation=" + dateCreation + ", adresse=" + adresse + ", gouvernera="
				+ gouvernera + ", delegation=" + delegation + ", localité=" + localité + ", code_postale="
				+ code_postale + ", cod=" + cod + ", mode_paiement=" + mode_paiement + ", service=" + service
				+ ", designation=" + designation + ", remarque=" + remarque + ", etat=" + etat + ", anomalie="
				+ anomalie + ", nb_p=" + nb_p + ", longeur=" + longeur + ", largeur=" + largeur + ", hauteur=" + hauteur
				+ ", poids=" + poids + "]";
	}

	
	
	
	
}

