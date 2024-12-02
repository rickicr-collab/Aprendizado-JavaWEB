<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Editar Contato</title>
<link rel="icon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body class="bodynovo">
	<h1 class="h1novo">Editar Contato</h1>
	<form name="frmContato" action="update">
		<table>
			<tr>
				<td>Id: <input type="text" name="idcon" id="caixa3" readonly
					value="<%out.print(request.getAttribute("idcon"));%>"></td>
			</tr>
			<tr>
				<td>Nome: <input type="text" name="nome" class="caixanovo1"
					value="<%out.print(request.getAttribute("nome"));%>"></td>
			</tr>
			<tr>
				<td>Telefone: <input type="text" name="telefone"
					class="caixanovo2"
					value="<%out.print(request.getAttribute("telefone"));%>"></td>
			</tr>
			<tr>
				<td>Email: <input type="text" name="email" class="caixanovo1"
					value="<%out.print(request.getAttribute("email"));%>"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" class="btnovo" onclick="validar()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>