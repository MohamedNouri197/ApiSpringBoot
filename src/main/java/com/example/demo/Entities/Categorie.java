package com.example.demo.Entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Categorie implements Serializable {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idcat;
public Categorie(Long idcat) {
		super();
		this.idcat = idcat;
	}

private String nom;
public Long getIdcat() {
	return idcat;
}

@OneToMany(mappedBy="categorie")
private List <Produit>produits;



public void setIdcat(Long idcat) {
	this.idcat = idcat;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Categorie(Long idcat, String nom) {
	super();
	this.idcat = idcat;
	this.nom = nom;
}
public Categorie() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Categorie [idcat=" + idcat + ", nom=" + nom + "]";
}


public List<Produit> getProduits() {
	return produits;
}
public void setProduits(Produit p) {
	this.produits = (List<Produit>) p;
}
}
