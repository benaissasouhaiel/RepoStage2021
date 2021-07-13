package com.example.livraison.Fournisseur;




import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.JoinColumnOrFormula;

import com.example.livraison.Colis.Colis;

import java.util.Date ;
import java.util.List;

@Entity
@Table
public class Fournisseur {

	
	
	
	
	@Id
@SequenceGenerator(
		name = "fournisseur_sequence",
		sequenceName = "fournisseur_sequence",
        allocationSize = 1 )
	
@GeneratedValue (strategy = GenerationType.SEQUENCE , 
               	generator = "fournisseur_Sequence")
	public Long   id ;
	
	
	public String nom_societe ;
	public String nom_f ;
	public String prenom_f ;
	public int tel_f ; 
	public int cin ; 
	public String email_f ;
	
	@Temporal(TemporalType.DATE)
	private Date date_fin_contrat ;
	public String adresse_societe;
	public String gouvernera_societe ;
	public String  localite_societe;
	public String delegation_societe ;
    public int code_postal_societe ; 
	public String adresse_livraison;
    public String gouvernera_livraison ; 
	public String  localite_livraison;
	public String delegation_livraison ;
	public int code_postal_livraison  ;
	public int prix_livraison ;
	public int prix_retour ;
	public String  password ;
	
	
	@OneToMany(mappedBy = "fournisseur")
	public List<Colis> colis ;
	
	
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}




	public List<Colis> getColis() {
		return colis;
	}




	public void setColis(List<Colis> colis) {
		this.colis = colis;
	}




	public Fournisseur(Long id, String nom_societe, String nom_f, String prenom_f, int tel_f, int cin, String email_f,
			Date date_fin_contrat, String adresse_societe, String gouvernera_societe, String localite_societe,
			String delegation_societe, int code_postal_societe, String adresse_livraison, String gouvernera_livraison,
			String localite_livraison, String delegation_livraison, int code_postal_livraison, int prix_livraison,
			int prix_retour, String password, List<Colis> colis) {
		super();
		this.id = id;
		this.nom_societe = nom_societe;
		this.nom_f = nom_f;
		this.prenom_f = prenom_f;
		this.tel_f = tel_f;
		this.cin = cin;
		this.email_f = email_f;
		this.date_fin_contrat = date_fin_contrat;
		this.adresse_societe = adresse_societe;
		this.gouvernera_societe = gouvernera_societe;
		this.localite_societe = localite_societe;
		this.delegation_societe = delegation_societe;
		this.code_postal_societe = code_postal_societe;
		this.adresse_livraison = adresse_livraison;
		this.gouvernera_livraison = gouvernera_livraison;
		this.localite_livraison = localite_livraison;
		this.delegation_livraison = delegation_livraison;
		this.code_postal_livraison = code_postal_livraison;
		this.prix_livraison = prix_livraison;
		this.prix_retour = prix_retour;
		this.password = password;
		this.colis = colis;
	}




	public String getNom_societe() {
		return nom_societe;
	}


	public void setNom_societe(String nom_societe) {
		this.nom_societe = nom_societe;
	}


	public String getNom_f() {
		return nom_f;
	}


	public void setNom_f(String nom_f) {
		this.nom_f = nom_f;
	}


	public String getPrenom_f() {
		return prenom_f;
	}


	public void setPrenom_f(String prenom_f) {
		this.prenom_f = prenom_f;
	}


	public int getTel_f() {
		return tel_f;
	}


	public void setTel_f(int tel_f) {
		this.tel_f = tel_f;
	}


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public String getEmail_f() {
		return email_f;
	}


	public void setEmail_f(String email_f) {
		this.email_f = email_f;
	}


	public Date getDate_fin_contrat() {
		return date_fin_contrat;
	}


	public void setDate_fin_contrat(Date date_fin_contrat) {
		this.date_fin_contrat = date_fin_contrat;
	}


	public String getAdresse_societe() {
		return adresse_societe;
	}


	public void setAdresse_societe(String adresse_societe) {
		this.adresse_societe = adresse_societe;
	}


	public String getGouvernera_societe() {
		return gouvernera_societe;
	}


	public void setGouvernera_societe(String gouvernera_societe) {
		this.gouvernera_societe = gouvernera_societe;
	}


	public String getLocalite_societe() {
		return localite_societe;
	}


	public void setLocalite_societe(String localite_societe) {
		this.localite_societe = localite_societe;
	}


	public String getDelegation_societe() {
		return delegation_societe;
	}


	public void setDelegation_societe(String delegation_societe) {
		this.delegation_societe = delegation_societe;
	}


	public int getCode_postal_societe() {
		return code_postal_societe;
	}


	public void setCode_postal_societe(int code_postal_societe) {
		this.code_postal_societe = code_postal_societe;
	}


	public String getAdresse_livraison() {
		return adresse_livraison;
	}


	public void setAdresse_livraison(String adresse_livraison) {
		this.adresse_livraison = adresse_livraison;
	}


	public String getGouvernera_livraison() {
		return gouvernera_livraison;
	}


	public void setGouvernera_livraison(String gouvernera_livraison) {
		this.gouvernera_livraison = gouvernera_livraison;
	}


	public String getLocalite_livraison() {
		return localite_livraison;
	}


	public void setLocalite_livraison(String localite_livraison) {
		this.localite_livraison = localite_livraison;
	}


	public String getDelegation_livraison() {
		return delegation_livraison;
	}


	public void setDelegation_livraison(String delegation_livraison) {
		this.delegation_livraison = delegation_livraison;
	}


	public int getCode_postal_livraison() {
		return code_postal_livraison;
	}


	public void setCode_postal_livraison(int code_postal_livraison) {
		this.code_postal_livraison = code_postal_livraison;
	}


	public int getPrix_livraison() {
		return prix_livraison;
	}


	public void setPrix_livraison(int prix_livraison) {
		this.prix_livraison = prix_livraison;
	}


	public int getPrix_retour() {
		return prix_retour;
	}


	public void setPrix_retour(int prix_retour) {
		this.prix_retour = prix_retour;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Fournisseur [id=" + id + ", nom_societe=" + nom_societe + ", nom_f=" + nom_f + ", prenom_f=" + prenom_f
				+ ", tel_f=" + tel_f + ", cin=" + cin + ", email_f=" + email_f + ", date_fin_contrat="
				+ date_fin_contrat + ", adresse_societe=" + adresse_societe + ", gouvernera_societe="
				+ gouvernera_societe + ", localite_societe=" + localite_societe + ", delegation_societe="
				+ delegation_societe + ", code_postal_societe=" + code_postal_societe + ", adresse_livraison="
				+ adresse_livraison + ", gouvernera_livraison=" + gouvernera_livraison + ", localite_livraison="
				+ localite_livraison + ", delegation_livraison=" + delegation_livraison + ", code_postal_livraison="
				+ code_postal_livraison + ", prix_livraison=" + prix_livraison + ", prix_retour=" + prix_retour
				+ ", password=" + password + ", colis=" + colis + "]";
	}


	
	

	
}


















