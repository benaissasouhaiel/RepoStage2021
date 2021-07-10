package com.example.livraison.Colis;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
	public Long   Réference ; 
	
	
	public String Nom_C ;
	public String Prenom_C ;
	public int Tel_C ; 
	//public String Date_de_création ;
	public String Adresse ; 
	public String Gouvernera ; 
	public String Délégation ;
	public String Localité;
	public int Code_postale ; 
	public int COD ; 
	public String Mode_Paiement; 
	public String Service  ;
	public String Designation  ;
	public String Remarque ; 
	public String Etat ;
	public String Anomalie ;
	public int Nb_P ;
	public int Longeur ;
	public int Largeur ;
	public int Hauteur ;
	public int Poids ;
	
	
	
	
	



	public Colis() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Colis(Long réference, String nom_C, String prenom_C, int tel_C, String adresse,
			String gouvernera, String délégation, String localité, int code_postale, int cOD, String mode_Paiement,
			String service, String designation, String remarque, String etat, String anomalie, int nb_P, int longeur,
			int largeur, int hauteur, int poids) {
		super();
		Réference = réference;
		Nom_C = nom_C;
		Prenom_C = prenom_C;
		Tel_C = tel_C;
		//Date_de_création = date_de_création;
		Adresse = adresse;
		Gouvernera = gouvernera;
		Délégation = délégation;
		Localité = localité;
		Code_postale = code_postale;
		COD = cOD;
		Mode_Paiement = mode_Paiement;
		Service = service;
		Designation = designation;
		Remarque = remarque;
		Etat = etat;
		Anomalie = anomalie;
		Nb_P = nb_P;
		Longeur = longeur;
		Largeur = largeur;
		Hauteur = hauteur;
		Poids = poids;
	}






	public String getNom_C() {
		return Nom_C;
	}
	public void setNom_C(String nom_C) {
		Nom_C = nom_C;
	}
	public String getPrenom_C() {
		return Prenom_C;
	}
	public void setPrenom_C(String prenom_C) {
		Prenom_C = prenom_C;
	}
	public int getTel_C() {
		return Tel_C;
	}
	public void setTel_C(int tel_C) {
		Tel_C = tel_C;
	}
	
	//public String getDate_de_création() {
		//return Date_de_création;
	//}



	//public void setDate_de_création(String date_de_création) {
		//Date_de_création = date_de_création;
	//}



	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getGouvernera() {
		return Gouvernera;
	}
	public void setGouvernera(String gouvernera) {
		Gouvernera = gouvernera;
	}
	public String getDélégation() {
		return Délégation;
	}
	public void setDélégation(String délégation) {
		Délégation = délégation;
	}
	public String getLocalité() {
		return Localité;
	}
	public void setLocalité(String localité) {
		Localité = localité;
	}
	public int getCode_postale() {
		return Code_postale;
	}
	public void setCode_postale(int code_postale) {
		Code_postale = code_postale;
	}
	public int getCOD() {
		return COD;
	}
	public void setCOD(int cOD) {
		COD = cOD;
	}
	public String getMode_Paiement() {
		return Mode_Paiement;
	}
	public void setMode_Paiement(String mode_Paiement) {
		Mode_Paiement = mode_Paiement;
	}
	public String getService() {
		return Service;
	}
	public void setService(String service) {
		Service = service;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getRemarque() {
		return Remarque;
	}
	public void setRemarque(String remarque) {
		Remarque = remarque;
	}
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		Etat = etat;
	}
	public String getAnomalie() {
		return Anomalie;
	}
	public void setAnomalie(String anomalie) {
		Anomalie = anomalie;
	}
	public int getNb_P() {
		return Nb_P;
	}
	public void setNb_P(int nb_P) {
		Nb_P = nb_P;
	}
	public int getLongeur() {
		return Longeur;
	}
	public void setLongeur(int longeur) {
		Longeur = longeur;
	}
	public int getLargeur() {
		return Largeur;
	}
	public void setLargeur(int largeur) {
		Largeur = largeur;
	}
	public int getHauteur() {
		return Hauteur;
	}
	public void setHauteur(int hauteur) {
		Hauteur = hauteur;
	}
	public int getPoids() {
		return Poids;
	}
	public void setPoids(int poids) {
		Poids = poids;
	}






	@Override
	public String toString() {
		return "Colis [Réference=" + Réference + ", Nom_C=" + Nom_C + ", Prenom_C=" + Prenom_C + ", Tel_C=" + Tel_C
				+ ", Adresse=" + Adresse + ", Gouvernera=" + Gouvernera + ", Délégation=" + Délégation + ", Localité="
				+ Localité + ", Code_postale=" + Code_postale + ", COD=" + COD + ", Mode_Paiement=" + Mode_Paiement
				+ ", Service=" + Service + ", Designation=" + Designation + ", Remarque=" + Remarque + ", Etat=" + Etat
				+ ", Anomalie=" + Anomalie + ", Nb_P=" + Nb_P + ", Longeur=" + Longeur + ", Largeur=" + Largeur
				+ ", Hauteur=" + Hauteur + ", Poids=" + Poids + "]";
	}






	





	
	
}
	


	


	
