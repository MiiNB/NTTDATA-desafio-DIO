package com.example.pedidos.order;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "produtos-service")  // nome do microserviço de produtos registrado no Eureka
public interface ProductClient {

    @GetMapping("/produtos")  // caminho do endpoint no produtos-service
    List<Produto> listarProdutos();
}

