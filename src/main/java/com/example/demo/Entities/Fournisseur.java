package com.example.demo.Entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Fournisseur  implements Serializable {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idf;
private String nom;
private String prenom;
private String adresse;
private String email;
private String motdepasse;

@ManyToMany
@JoinTable(name="fournisseurProduit",joinColumns = @JoinColumn(name="idf"),inverseJoinColumns = @JoinColumn(name="idp"))
private List<Produit> listeProduits=new ArrayList<>();






}
