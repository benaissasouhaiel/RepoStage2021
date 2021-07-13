package com.example.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class UserStage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iduser;
	private String nom;
	private String username;
	private String Tel;
	private String email;
	@Temporal(TemporalType.DATE)
	private Date datefincontrat;
	private String nomsociete ;
	private String gouvernerasociete;
	private String adresselivraion;
	private String delgationsociete;
	private String localitesociete;
	private int codepostalesociete;
	private String image;
	private String adresselivraison;
	private String gouverneralivraison;
	private String localitelivraison;
	private String Codepostalelivraision;
	private float prixlivraision;
	private float prixretour;
	private String password;
	
	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Role> role = new ArrayList<>();
	
	public UserStage() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	

	public UserStage(int iduser, String nom, String username, String tel, String email, Date datefincontrat,
			String nomsociete, String gouvernerasociete, String adresselivraion, String delgationsociete,
			String localitesociete, int codepostalesociete, String image, String adresselivraison,
			String gouverneralivraison, String localitelivraison, String codepostalelivraision, float prixlivraision,
			float prixretour, String password, List<Role> role) {
		super();
		this.iduser = iduser;
		this.nom = nom;
		this.username = username;
		Tel = tel;
		this.email = email;
		this.datefincontrat = datefincontrat;
		this.nomsociete = nomsociete;
		this.gouvernerasociete = gouvernerasociete;
		this.adresselivraion = adresselivraion;
		this.delgationsociete = delgationsociete;
		this.localitesociete = localitesociete;
		this.codepostalesociete = codepostalesociete;
		this.image = image;
		this.adresselivraison = adresselivraison;
		this.gouverneralivraison = gouverneralivraison;
		this.localitelivraison = localitelivraison;
		Codepostalelivraision = codepostalelivraision;
		this.prixlivraision = prixlivraision;
		this.prixretour = prixretour;
		this.password = password;
		this.role = role;
	}







	public int getIduser() {
		return iduser;
	}


	public void setIduser(int iduser) {
		this.iduser = iduser;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	

	public String getUsername() {
		return username;
	}







	public void setUsername(String username) {
		this.username = username;
	}







	public String getPassword() {
		return password;
	}







	public void setPassword(String password) {
		this.password = password;
	}







	public String getTel() {
		return Tel;
	}


	public void setTel(String tel) {
		Tel = tel;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDatefincontrat() {
		return datefincontrat;
	}


	public void setDatefincontrat(Date datefincontrat) {
		this.datefincontrat = datefincontrat;
	}


	public String getNomsociete() {
		return nomsociete;
	}


	public void setNomsociete(String nomsociete) {
		this.nomsociete = nomsociete;
	}


	public String getGouvernerasociete() {
		return gouvernerasociete;
	}


	public void setGouvernerasociete(String gouvernerasociete) {
		this.gouvernerasociete = gouvernerasociete;
	}


	public String getAdresselivraion() {
		return adresselivraion;
	}


	public void setAdresselivraion(String adresselivraion) {
		this.adresselivraion = adresselivraion;
	}


	public String getDelgationsociete() {
		return delgationsociete;
	}


	public void setDelgationsociete(String delgationsociete) {
		this.delgationsociete = delgationsociete;
	}


	public String getLocalitesociete() {
		return localitesociete;
	}


	public void setLocalitesociete(String localitesociete) {
		this.localitesociete = localitesociete;
	}


	public int getCodepostalesociete() {
		return codepostalesociete;
	}


	public void setCodepostalesociete(int codepostalesociete) {
		this.codepostalesociete = codepostalesociete;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getAdresselivraison() {
		return adresselivraison;
	}


	public void setAdresselivraison(String adresselivraison) {
		this.adresselivraison = adresselivraison;
	}


	public String getGouverneralivraison() {
		return gouverneralivraison;
	}


	public void setGouverneralivraison(String gouverneralivraison) {
		this.gouverneralivraison = gouverneralivraison;
	}


	public String getLocalitelivraison() {
		return localitelivraison;
	}


	public void setLocalitelivraison(String localitelivraison) {
		this.localitelivraison = localitelivraison;
	}


	public String getCodepostalelivraision() {
		return Codepostalelivraision;
	}


	public void setCodepostalelivraision(String codepostalelivraision) {
		Codepostalelivraision = codepostalelivraision;
	}


	public float getPrixlivraision() {
		return prixlivraision;
	}


	public void setPrixlivraision(float prixlivraision) {
		this.prixlivraision = prixlivraision;
	}


	public float getPrixretour() {
		return prixretour;
	}


	public void setPrixretour(float prixretour) {
		this.prixretour = prixretour;
	}


	

	public List<Role> getRole() {
		return role;
	}


	public void setRole(List<Role> role) {
		this.role = role;
	}

	
}
