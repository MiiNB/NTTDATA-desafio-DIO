package com.example.produtos_service.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.example.produtos_service.produto.ProductRepository;
import com.example.produtos_service.produto.Produto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired 
    private ProductRepository repo;

    @PersistenceContext
    private EntityManager em;

    @GetMapping
    public List<Produto> all() {
        return repo.findAll();
    }

    @PostMapping
    public Produto create(@RequestBody Produto p) {
        return repo.save(p);
    }

    @DeleteMapping
    public void apagarProdutos() {
        repo.deleteAll(); // deleta todos produtos
    }

    // Endpoint para deletar tudo e resetar o ID
    @Transactional
    @DeleteMapping("/reset")
    public void resetarProdutos() {
        em.createNativeQuery("TRUNCATE TABLE produto RESTART IDENTITY").executeUpdate();
    }
}


