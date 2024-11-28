# Aplicação Web de Agenda de Contatos - JavaWeb

## Objetivo

Esta é uma aplicação web desenvolvida em Java, com foco na criação de uma agenda de contatos. A aplicação permite que o usuário adicione, edite e exclua contatos, sincronizando os dados com um banco de dados MySQL. A agenda exibe os dados de forma dinâmica em uma página HTML, com estilização utilizando arquivos CSS e validação com JavaScript.

A aplicação também utiliza o servidor de aplicação Tomcat v10.3 para a conexão com o banco de dados e a exibição dos dados via HTTPS.

## Funcionalidades

- **Adicionar Contatos**: Permite adicionar novos contatos à agenda.
- **Editar Contatos**: Possibilita a edição de contatos já cadastrados.
- **Excluir Contatos**: Oferece a possibilidade de excluir contatos da agenda.
- **Banco de Dados**: Utiliza um banco de dados MySQL para armazenar os contatos.
- **Validação**: Utiliza JavaScript para validar as entradas de dados do usuário.
- **Estilização**: O layout da página é estilizado com CSS.
- **Páginas Dinâmicas**: A agenda é gerada dinamicamente a partir dos dados armazenados no banco.

## Estrutura do Projeto

A estrutura do projeto é organizada da seguinte forma:

### Pacote `controller`
- **Controle.java**: Classe responsável pela lógica de controle da aplicação, incluindo as operações de adicionar, editar e excluir contatos.

### Pacote `model`
- **JavaBeans.java**: Classe que representa o modelo de dados de um contato, com os atributos necessários como nome, telefone, e-mail, etc.
- **DAO.java**: Classe responsável pela comunicação com o banco de dados (MySQL), realizando operações de inserção, atualização, exclusão e consulta.

### Estrutura `webcontent`

#### Pasta `scripts`
- **confirmador.js**: Arquivo JavaScript que implementa a confirmação de exclusão de contatos.
- **validador.js**: Arquivo JavaScript que valida os campos do formulário ao adicionar ou editar contatos (ex: validação de e-mail, telefone, etc.).

#### Arquivos HTML
- **index.html**: Página inicial da aplicação, que lista todos os contatos cadastrados.
- **novo.html**: Página de formulário para adicionar um novo contato ou editar um existente.

#### Arquivo JSP
- **agenda.jsp**: Página que exibe a lista de contatos cadastrados, gerada dinamicamente a partir do banco de dados.

### Banco de Dados

A aplicação utiliza um banco de dados MySQL. O banco de dados e a tabela são criados através de um **dump** que acompanha o projeto, com o modelo gerado via engenharia reversa.

#### Estrutura da Tabela no MySQL
A tabela utilizada para armazenar os contatos tem a seguinte estrutura:

```sql
CREATE TABLE contatos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL,
    telefone VARCHAR(10) NOT NULL,
    email VARCHAR(30)
);


/agenda-contatos
│
├── /src
│   ├── /controller
│   │   └── Controle.java
│   │
│   ├── /model
│   │   ├── JavaBeans.java
│   │   └── DAO.java
│   │
├── /webcontent
│   ├── /scripts
│   │   ├── confirmador.js
│   │   └── validador.js
│   │
│   ├── index.html
│   ├── novo.html
│   ├── agenda.jsp
│
├── agenda_contacts_dump.sql
└── /WEB-INF
    └── web.xml

