# Projeto Agendador de Tarefas

## Descrição

Este projeto é uma aplicação Spring Boot desenvolvida para agendamento e gerenciamento de tarefas. Ele utiliza Java 21 e Gradle para construção, integrando-se com funcionalidades de segurança com Spring Security, persistência de dados com Spring Data JPA e comunicação entre serviços com OpenFeign. O projeto é conteinerizado com Docker para facilitar a implantação.

## Tecnologias Utilizadas

As principais tecnologias e ferramentas utilizadas neste projeto incluem:

*   **Java 21**: Linguagem de programação principal.
*   **Spring Boot 3.2.5**: Framework para construção de aplicações Java robustas e eficientes.
*   **Gradle**: Ferramenta de automação de build.
*   **Spring Data JPA**: Para persistência de dados e interação com o banco de dados.
*   **Spring Security**: Para autenticação e autorização.
*   **Spring Boot Starter Web**: Para a construção de aplicações web e APIs RESTful.
*   **Spring Cloud Starter OpenFeign**: Para comunicação declarativa entre serviços.
*   **Lombok**: Para reduzir o código boilerplate.
*   **MySQL Connector/J**: Driver JDBC para conexão com MySQL.
*   **JUnit 5**: Para testes unitários e de integração.
*   **SonarQube**: Para análise de qualidade de código.
*   **Docker**: Para conteinerização da aplicação.

## Estrutura do Projeto

A estrutura do projeto segue as convenções de um projeto Spring Boot, com pacotes organizados por funcionalidade:

```
src/
├── main/
│   ├── java/
│   │   └── com/costadev/agendadortarefas/
│   │       ├── business/             # Lógica de negócio e serviços
│   │       ├── controller/           # Controladores REST
│   │       └── infrasctruture/       # Configurações de infraestrutura e exceções
│   └── resources/            # Arquivos de configuração e templates
├── test/
│   └── java/
│       └── com/costadev/agendadortarefas/ # Testes unitários e de integração
└── ...
```

## Como Executar

Para executar a aplicação localmente, siga os passos abaixo:

1.  **Pré-requisitos**:
    *   Java Development Kit (JDK) 21 ou superior.
    *   Docker (para conteinerização).

2.  **Clonar o repositório**:

    ```bash
    git clone https://github.com/guilhermeoliveira-software/agendador-tarefas.git
    cd agendador-tarefas
    ```

3.  **Compilar e executar (sem Docker)**:

    ```bash
    ./gradlew build
    java -jar build/libs/agendador-tarefas-0.0.1-SNAPSHOT.jar
    ```

    A aplicação estará disponível em `http://localhost:8080`.

4.  **Configuração do Docker**:

    O projeto inclui um `Dockerfile` para facilitar a conteinerização da aplicação:

    ```bash
    docker build -t agendador-tarefas-app .
    docker run -p 8080:8080 agendador-tarefas-app
    ```

    A aplicação estará acessível em `http://localhost:8080` dentro do contêiner.

