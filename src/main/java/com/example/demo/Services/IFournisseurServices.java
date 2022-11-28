package com.example.demo.Services;

import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Fournisseur;
import com.example.demo.Entities.Produit;
@Repository
public interface IFournisseurServices {
public Fournisseur AddFournisseur(Fournisseur f);
public Fournisseur FourAddPoduit(Long  idf,Long idp);
}
