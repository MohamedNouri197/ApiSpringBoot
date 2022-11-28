package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Produit;
@Repository
public interface IProduitServices {
public Produit AddProduit (Produit p);
public List <Produit> FindAllProducts();
}
