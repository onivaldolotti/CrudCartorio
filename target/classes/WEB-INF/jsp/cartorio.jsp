<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gerenciamento de Cartórios</title>
</head>
<body>
<h1>Dados dos Cartórios</h1>
<form:form action="cartorio.do" method="POST" commandName="cartorio">
	<table>
		<tr>
			<td>Cartorio ID</td>
			<td><form:input path="cartorioId" /></td>
		</tr>
		<tr>
			<td>Cartorio</td>
			<td><form:input path="cartorio" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Adiciona" />
				<input type="submit" name="action" value="Edita" />
				<input type="submit" name="action" value="Deleta" />
				<input type="submit" name="action" value="ProcuraId" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>Cartório</th>
	<c:forEach items="${cartorioList}" var="cartorio">
		<tr>
			<td>${cartorio.cartorioId}</td>
			<td>${cartorio.cartorio}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>