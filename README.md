# Java Spring Professional Desafio: Consulta vendas


# Sobre o projeto
Este projeto é o desafio do capítulo sobre JPA, consultas SQL e JPQL do Curso Java Spring Professional da [DevSuperior](https://devsuperior.com.br "Site da DevSuperior").
O desafio consiste em forkar o seguinte projeto https://github.com/devsuperior/desafio-consulta-vendas e implementar as consultas conforme as especificações. 


## Especificações e Modelo Conceitual
Trata-se de um sistema de vendas (Sale) e vendedores (Seller). Cada venda está para um vendedor, e um 
vendedor pode ter várias vendas. 
![Modelo Conceitual](https://github.com/GabrielSilva2310/Assets/blob/main/Images%20Consultas%20e%20vendas/Modelo%20Conceitual.png)



O projeto deverá implementar as seguintes consultas (ambas deverão estar corretas): 



Relatório de vendas 
1. [IN] O usuário informa, opcionalmente, data inicial, data final e um trecho do nome do vendedor. 
2. [OUT] O sistema informa uma listagem paginada contendo id, data, quantia vendida e nome do 
vendedor, das vendas que se enquadrem nos dados informados. 

Informações complementares: 
- Se a data final não for informada, considerar a data atual do sistema. Para instanciar a data atual, 
utilize o comando: 
LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()); 
- Se a data inicial não for informada, considerar a data de 1 ano antes da data final. Para instanciar 
uma data com um ano a menos, use a função minusYears: 
LocalDate result = minhaData.minusYears(1L); 
- Se o nome não for informado, considerar o texto vazio.



Sumário de vendas por vendedor 
1. [IN] O usuário informa, opcionalmente, data inicial, data final. 
2. [OUT] O sistema informa uma listagem contendo nome do vendedor e soma de vendas deste vendedor 
no período informado.

Informações complementares: 
- As mesmas do caso de uso Relatório de vendas



Collection do Postman para testar as requisições https://www.getpostman.com/collections/dea7904f994cb87c3d12

# Tecnologias utilizadas
- Java 17
- Spring Boot 3
- Maven
- JPA/Hibernate
- H2 Database
- Postman

# Como executar o projeto

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/GabrielSilva2310/Spring-Professional-Desafio-consulta-vendas.git

# entrar na pasta do projeto
cd Spring-Professional-Desafio-consulta-vendas

# executar o projeto
./mvnw spring-boot:run
```

# Competências avaliadas no desafio
- Realização de casos de uso
- Criação de endpoints de API Rest com parâmetros de consulta opcionais
- Implementação de consultas em banco de dados relacional com Spring Data JPA

# Autor

Gabriel Da Silva 

www.linkedin.com/in/gabriel-da-silva-457039193
