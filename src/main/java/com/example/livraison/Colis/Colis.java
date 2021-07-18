package com.example.livraison.Colis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.example.livraison.Fournisseur.Fournisseur;

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
	public int tel_c_1 ;
	public int tel_c_2 ;
	private LocalDateTime date_creation = LocalDateTime.now();
	public String adresse ; 
	public String gouvernorat ; 
	public String delegation ;
	public String localite;
	public int code_postal ; 
	public int cod ; 
	public String mode_paiement; 
	public String service  ;
	public String designation  ;
	public String remarque ; 
	public String etat ;
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


	public Colis(Long reference, String nom_c, String prenom_c, int tel_c_1, int tel_c_2, LocalDateTime date_creation,
			String adresse, String gouvernorat, String delegation, String localite, int code_postal, int cod,
			String mode_paiement, String service, String designation, String remarque, String etat, String anomalie,
			int nb_p, int longeur, int largeur, int hauteur, int poids) {
		super();
		this.reference = reference;
		this.nom_c = nom_c;
		this.prenom_c = prenom_c;
		this.tel_c_1 = tel_c_1;
		this.tel_c_2 = tel_c_2;
		this.date_creation = date_creation;
		this.adresse = adresse;
		this.gouvernorat = gouvernorat;
		this.delegation = delegation;
		this.localite = localite;
		this.code_postal = code_postal;
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
		this.poids = poids ;
		
	}
	
	 

	@Override
	public String toString() {
		return "Colis [reference=" + reference + ", nom_c=" + nom_c + ", prenom_c=" + prenom_c + ", tel_c_1=" + tel_c_1
				+ ", tel_c_2=" + tel_c_2 + ", date_creation=" + date_creation + ", adresse=" + adresse
				+ ", gouvernorat=" + gouvernorat + ", delegation=" + delegation + ", localite=" + localite
				+ ", code_postal=" + code_postal + ", cod=" + cod + ", mode_paiement=" + mode_paiement + ", service="
				+ service + ", designation=" + designation + ", remarque=" + remarque + ", etat=" + etat + ", anomalie="
				+ anomalie + ", nb_p=" + nb_p + ", longeur=" + longeur + ", largeur=" + largeur + ", hauteur=" + hauteur
				+ ", poids=" + poids + "]";
	}


	public Long getReference() {
		return reference;
	}


	public void setReference(Long reference) {
		this.reference = reference;
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


	public LocalDateTime getDate_creation() {
		return date_creation;
	}


	public void setDate_creation(LocalDateTime date_creation) {
		this.date_creation = date_creation;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getGouvernorat() {
		return gouvernorat;
	}


	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}


	public String getDelegation() {
		return delegation;
	}


	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}


	public String getLocalite() {
		return localite;
	}


	public void setLocalite(String localite) {
		this.localite = localite;
	}


	public int getCode_postal() {
		return code_postal;
	}


	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public String getMode_paiement() {
		return mode_paiement;
	}


	public void setMode_paiement(String mode_paiement) {
		this.mode_paiement = mode_paiement;
	}


	public String getService() {
		return service;
	}


	public void setService(String service) {
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


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
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
	public Fournisseur getFournisseur() {
		return fournisseur;
	}


	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
}
