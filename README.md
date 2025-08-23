Projeto NTT DATA
<img width="1083" height="576" alt="image" src="https://github.com/user-attachments/assets/a41c9aed-a30a-466e-915f-14abbf3b0a77" />
___________________________________________________________________________________________________________________________________
Descrição
Este projeto é uma API REST desenvolvida em Java Spring Boot, organizada em microsserviços: <br>
**Produtos**: gerencia cadastro, listagem e exclusão de produtos. <br>
**Pedidos**: permite criar pedidos com base nos produtos disponíveis (não persiste pedidos).<br>
Todos os dados dos produtos são armazenados no H2 em memória, portanto desaparecem ao reiniciar a aplicação.
___________________________________________________________________________________________________________________________________
### **Tecnologias utilizadas**
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database (em memória)
- Spring Cloud Gateway
___________________________________________________________________________________________________________________________________
### Endpoint disponíveis
| Método | URL         | Descrição                        |
|--------|------------|----------------------------------|
| GET    | /produtos  | Lista todos os produtos cadastrados |
| POST   | /produtos  | Cadastra um novo produto          |
| DELETE | /produtos  | Deleta todos os produtos          |


**Obs:  o id não é resetado, mas como o H2 é em memória, ao reiniciar a aplicação os produtos e ids voltam ao zero.**
___________________________________________________________________________________________________________________________________
### Portas
8100 → Produtos: http://localhost:8100/produtos <br>
8200 → Pedidos: http://localhost:8200/pedidos <br>
8700 → Gateway: [http://localhost:8700/produtos](http://localhost:8100/produtos) e [http://localhost:8700/pedidos](http://localhost:8200/pedidos) <br>
**Authorization: Bearer devtoken123**
___________________________________________________________________________________________________________________________________
### Cadastrando os Produtos
<img width="830" height="576" alt="image" src="https://github.com/user-attachments/assets/712fd51e-2d38-454a-bb4a-065b3b6cab87" />
_________________________________________________________________________________________________________________________________

### Listando os Produtos GET /produtos
<img width="747" height="809" alt="image1" src="https://github.com/user-attachments/assets/b6b258f4-235b-4638-b232-31c3a8d5a858" />
_________________________________________________________________________________________________________________________________

### Criando pedido POST /pedido
- vou escolher dois itens
<img width="826" height="778" alt="image2" src="https://github.com/user-attachments/assets/c7bb81c8-699c-4216-9123-17b30a452bb3" />
_________________________________________________________________________________________________________________________________

### Testando a porta Gateway
<img width="700" height="798" alt="image3" src="https://github.com/user-attachments/assets/486504fd-3fc8-4e61-8e08-7e07c97a45fa" />
_________________________________________________________________________________________________________________________________

### Listando os Produtos
<img width="1546" height="856" alt="image4" src="https://github.com/user-attachments/assets/7e396a21-f709-4dd8-983d-e2867f63f280" />
_________________________________________________________________________________________________________________________________

### Desabilitando o Authorization: Bearer devtoken123
<img width="1479" height="578" alt="image5" src="https://github.com/user-attachments/assets/ac8e2a3a-89fc-4f1a-b098-0d8fc78a487e" />
_________________________________________________________________________________________________________________________________

### Habilitando Authorization e deletando tudo
<img width="1506" height="588" alt="image6" src="https://github.com/user-attachments/assets/5183c1c7-f152-4a37-a37b-9c5f36472e48" />

