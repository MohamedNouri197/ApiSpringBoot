package com.example.demo.Entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idc;
private String nom;
private String prenom;

private String adresse;
private String email;
private String motdepasse;

@OneToMany
private List <Commande> commandes;


}
