<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
@SuppressWarnings("unchecked")
ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("contatos");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Area de Registros</title>
<link rel="icon" href="imagens/favicon.png">
<style>
body {
	margin: 0;
	font-family: "Open Sans", sans-serif;
	font-size: 15px;
	font-weight: 400;
	text-align: left;
	display: table;
	width: 100%;
	background-color: white;
	padding-left: 5px;
}

h1 {
	font-family: "Open Sans", sans-serif;
	color: #66bbff;
	text-align: left;
}

.Botao1 {
	text-decoration: none;
	background-color: #66bbff;
	padding: 5px 10px 5px 10px;
	font-style: 1.2em;
	font-weight: 700;
	color: #fff;
	border-radius: 5px;
	cursor: pointer;
}

.Botao2 {
	text-decoration: none;
	background-color: #d51213;
	padding: 5px 10px 5px 10px;
	font-style: 1.2em;
	font-weight: 700;
	color: #fff;
	border-radius: 5px;
	border: 0;
	cursor: pointer;
}

#tabela {
	margin-top: 35px;
	border-collapse: collapse;
}

#tabela th {
	border: 1px solid #ddd;
	padding: 5px;
	text-align: left;
	background-color: #66bbff;
	color: #fff;
}

#tabela td {
	border: 1px solid #ddd;
	padding: 7px;
}
</style>
</head>
<body>
	<h1>Agenda de Contatos</h1>
	<a href="novo.html" class="Botao1">Novo Contato</a>
	<a href="report" class="Botao2">Relatório Pdf</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Telefone</th>
				<th>E-mail</th>
				<th>Opções</th>

			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getIdcon()%></td>
				<td><%=lista.get(i).getNome()%></td>
				<td><%=lista.get(i).getTelefone()%></td>
				<td><%=lista.get(i).getEmail()%></td>
				<td><a href="select?idcon=<%=lista.get(i).getIdcon()%>"
					class="Botao1">Editar</a> <a
					href="javascript: confirmar(<%=lista.get(i).getIdcon()%>)"
					class="Botao2">Excluir</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<script src="scripts/confirmador.js"></script>
</body>
</html>