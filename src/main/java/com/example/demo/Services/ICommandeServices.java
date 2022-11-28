package com.example.demo.Services;

import java.util.List;

import javax.swing.text.html.StyleSheet.ListPainter;

import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Commande;
@Repository
public interface ICommandeServices {
public Commande Commander(Commande cmnd);
public Commande ProduitToCommande(Long idp, Long idc);
public List<Commande> getAllCommande();

}
