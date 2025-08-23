package com.example.pedidos.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pedidos.order.Pedidos;
import com.example.pedidos.order.Produto;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    private List<Pedidos> pedidosList = new ArrayList<>();

    @PostMapping
    public Pedidos criarPedido(@RequestBody List<Produto> produtosSelecionados) {
        double total = produtosSelecionados.stream()
                        .mapToDouble(Produto::getPreco)
                        .sum();
        Pedidos novoPedido = new Pedidos(produtosSelecionados, total);
        pedidosList.add(novoPedido); // Salva na lista em memória
        return novoPedido;
        
        
    }

    
    @GetMapping
    public List<Pedidos> listarPedidos() {
    	return pedidosList;
    
    }

    
    
}
