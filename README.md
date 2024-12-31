## Descrição
API REST desenvolvida em Java com Spring Boot para realizar operações CRUD (Create, Read, Update, Delete) de pessoas utilizando MongoDB como banco de dados.

## Tecnologias Utilizadas
- Java 21
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven

## Funcionalidades
- Criar pessoa
- Buscar pessoa por ID
- Listar todas as pessoas
- Atualizar dados de pessoa
- Deletar pessoa

## Endpoints
- POST /peoples/id/add - Criar nova pessoa
- GET /peoples/id/all - Listar todas as pessoas
- GET /peoples/id/{id} - Buscar pessoa por ID
- PUT /peoples/id/{id} - Atualizar pessoa
- DELETE /peoples/id/{id} - Deletar pessoa

## Como Executar
1. Clone o repositório
2. Configure o MongoDB em application.properties
3. Execute `mvn spring-boot:run`
4. Acesse `http://localhost:8080`

## Estrutura do Projeto

src/
├── main/
│   ├── java/
│   │   └── com/api/pessoas/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
│       └── application.properties
