package com.example.pedidos.order;



import java.util.List;


public class Pedidos {
	
	
	
	
	
    private List<Produto> produtos;
    private double total;

    public Pedidos() {
        // Construtor vazio necessário para o Spring deserializar JSON
    }

    public Pedidos(List<Produto> produtos, double total) {
        this.produtos = produtos;
        this.total = total;
    }

    // Getters e Setters
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

	
}
