# Web Application for Contact Management (CRUD) with MySQL

Este projeto consiste em uma aplicação web desenvolvida em Java, utilizando JDBC para conexão com o banco de dados MySQL e operações CRUD (Create, Read, Update, Delete) para gerenciamento de uma lista de contatos. A aplicação conta com validações em JavaScript nas páginas HTML, tratamento de exceções adequado e boas práticas na implementação das classes Java (DAO) para interagir com o banco de dados. 

## Funcionalidades

- **CRUD de Contatos**: A aplicação permite adicionar, editar, excluir e listar contatos.
- **Validação em JavaScript**: Validações são realizadas nos campos das páginas HTML para garantir dados corretos (como nome, email e telefone).
- **Conexão com o Banco de Dados MySQL**: Utiliza-se JDBC para conectar a aplicação com um banco de dados MySQL, realizando operações no banco.
- **Servlets para Requisições HTTP**: A comunicação entre a interface e a lógica de negócios é feita através de servlets, utilizando o padrão MVC (Model-View-Controller).
- **Documentação Automatizada em Java**: A documentação das classes Java é gerada automaticamente utilizando ferramentas como o Javadoc.
- **Estrutura do Banco de Dados**: O banco de dados MySQL foi modelado utilizando engenharia reversa, com a geração de dumps e modelos das tabelas.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **MySQL**: Sistema de gerenciamento de banco de dados relacional.
- **JDBC**: Java Database Connectivity para interação com o banco de dados.
- **Servlets**: Para a implementação das requisições HTTP e controle da lógica de negócios.
- **HTML/CSS/JavaScript**: Para a construção da interface de usuário e validações de formulário no frontend.
- **Javadoc**: Para gerar a documentação automatizada das classes Java.
- **Maven**: Gerenciador de dependências utilizado para facilitar a construção e o gerenciamento do projeto.

## Estrutura do Projeto

```plaintext
├── src/
│   ├── dao/                  # Contém as classes DAO para interagir com o banco de dados
│   │   ├── ContactDAO.java   # Classe responsável pelas operações CRUD no banco de dados
│   ├── model/                # Contém as classes de modelo (representação do contato)
│   │   ├── Contact.java      # Classe modelo do Contato
│   ├── servlet/              # Contém os servlets que manipulam as requisições HTTP
│   │   ├── ContactServlet.java # Servlet que gerencia a lógica de CRUD
│   └── util/                 # Contém classes utilitárias como a conexão com o banco de dados
│       ├── DatabaseConnection.java # Classe que gerencia a conexão com o banco de dados
├── web/
│   ├── index.html            # Página inicial (exibe a lista de contatos)
│   ├── add_contact.html      # Página para adicionar novo contato
│   ├── edit_contact.html     # Página para editar um contato existente
│   ├── css/                  # Folhas de estilo CSS
│   └── js/                   # Scripts em JavaScript para validação do lado cliente
│       ├── validate.js       # Arquivo de validação de formulários
├── resources/
│   ├── sql/                  # Scripts SQL para criação do banco de dados e tabelas
│   │   ├── create_tables.sql # Script para criação das tabelas no MySQL
│   └── javadoc/              # Documentação gerada pelo Javadoc
├── pom.xml                   # Arquivo de configuração do Maven
└── README.md                 # Este arquivo
