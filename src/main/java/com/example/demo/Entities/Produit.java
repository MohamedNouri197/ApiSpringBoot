package com.example.demo.Entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table
@Getter
@Setter
public class Produit implements Serializable {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idp;
private String label;
private String description;
private Double prix;

@JsonIgnore
@ManyToMany(mappedBy = "listeProd")
private List <Commande> listeCommande;

@JsonIgnore
@ManyToMany(mappedBy = "listeProduits")
private List <Fournisseur> listeFour;



@JsonIgnore
@ManyToOne
private Categorie categorie;


public Produit(Long idp, String label, String description, Double prix, List<Commande> listeCommande,
		Categorie categorie) {
	super();
	this.idp = idp;
	this.label = label;
	this.description = description;
	this.prix = prix;
	this.listeCommande = listeCommande;
	this.categorie = categorie;
}


public Produit() {
	super();
	// TODO Auto-generated constructor stub
}


public Produit(String label, String description, Double prix, List<Commande> listeCommande, Categorie categorie) {
	super();
	this.label = label;
	this.description = description;
	this.prix = prix;
	this.listeCommande = listeCommande;
	this.categorie = categorie;
}


public Produit(Long idp, String label, String description, Double prix, List<Commande> listeCommande,
		List<Fournisseur> listeFour, Categorie categorie) {
	super();
	this.idp = idp;
	this.label = label;
	this.description = description;
	this.prix = prix;
	this.listeCommande = listeCommande;
	this.listeFour = listeFour;
	this.categorie = categorie;
}




}
