# 📐 Arquitetura de Camadas

Este repositório demonstra a aplicação do padrão **Arquitetura de Camadas**, uma abordagem amplamente utilizada para organizar sistemas de software em níveis com responsabilidades bem definidas. Essa separação facilita a manutenção, escalabilidade, testes e reutilização do código.

## 📚 O que é Arquitetura de Camadas?

A **Arquitetura de Camadas** divide a aplicação em diferentes camadas, onde cada uma tem uma responsabilidade específica. A comunicação entre as camadas é feita de forma hierárquica, promovendo o baixo acoplamento e a alta coesão.

### 🔧 Principais Camadas

1. **Camada de Apresentação (Controller ou Interface do Usuário)**  
   - Responsável por lidar com a entrada do usuário (ex: requisições HTTP).
   - Encaminha os dados para a camada de serviço.
   - Ex: Controllers em Spring Boot, Views em aplicações web.

2. **Camada de Serviço (Service Layer)**  
   - Contém a lógica de negócio da aplicação.
   - Orquestra operações entre repositórios, regras de negócio e validações.

3. **Camada de Persistência (Repository ou DAO)**  
   - Responsável por acessar o banco de dados.
   - Realiza operações de CRUD (Create, Read, Update, Delete).
   - Utiliza frameworks como JPA, Hibernate, JDBC, etc.

4. **Camada de Modelo (Domain ou Entity)**  
   - Representa as entidades e os objetos do domínio.
   - Contém atributos, relacionamentos e (em alguns casos) regras de negócio.

### 🗂️ Estrutura de Pastas Exemplo (Java/Spring)

src/

└── main/

    └── java/
    
        └── com/
        
            └── exemplo/
            
                ├── controller/  # Camada de Apresentação
                
                ├── service/          # Camada de Serviço
                
                ├── repository/       # Camada de Persistência
                
                ├── model/            # Camada de Modelo
                
                └── dto/              # (Opcional) Objetos de Transferência de Dados

                

✅ **Vantagens**

- Separação de responsabilidades

- Facilita testes unitários e integração

- Melhor organização do código

- Facilita manutenção e evolução do sistema

### ⚠️ Boas Práticas

- Evite que camadas pulem outras (ex: controller acessando diretamente o repositório).

- Use DTOs para transferir dados entre camadas, evitando exposição direta das entidades.

- Adicione validações e tratamento de erros na camada apropriada.

### 📌 Exemplo de Fluxo

[Usuário] → [Controller] → [Service] → [Repository] → [Banco de Dados]

### 🚀 Tecnologias Utilizadas

Java 17

Spring Boot

Spring Data JPA

PostgreSQL

Maven

### 🧠 Referências
Martin Fowler - Patterns of Enterprise Application Architecture

Domain-Driven Design - Eric Evans
