package com.example.demo.Entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Commande implements Serializable{
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idcom;
	@Enumerated(EnumType.STRING)
private Ecommande modeLivraison;
private String modepaiment;
private Double PrixTot;
//private Date dateCom;
private 	LocalDateTime dateCom = LocalDateTime.now();

//@ inverseColumn porte id qui vient de l'autre class
 
@ManyToMany
@JoinTable(name="ligne_commande",joinColumns = @JoinColumn(name="idcom") ,inverseJoinColumns = @JoinColumn(name="idp"))
private List<Produit> listeProd=new ArrayList<>();

@ManyToOne
private Client client;



}
