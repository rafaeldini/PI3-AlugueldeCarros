<%-- 
    Document   : ClienteCadastrado
    Created on : 19/11/2018, 04:01:18
    Author     : nadso
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"--%>
<%@page session="true" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
	<meta charset="utf-8">
	<title>Cadastrado Com sucesso</title>
</head>
<nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
   
        <div class="application-container">
		<div class="form-container">
                    <form method="get" action="/locacaoTADS/Home">
			<div class="form-header">CADASTRADO COM SUCESSO</div>
			<div class="form-button">
                            <button type="submit">Voltar</button>
  			</div>
                    </form>       
	<title>Cadastro de Cliente</title>
</head>
<nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
   
        <div class="application-container">
		<div class="form-container">
                    <form method="get" action="/locacaoTADS/Home">
			<div class="form-header">CADASTRADO COM SUCESSO</div>
			<div class="form-button">
                            <button type="submit">Voltar</button>
  			</div>
                    </form>       
                     <%--   <p>Nome: <c:out value="${func.nome}" /></p>
                       <p>CPF: <c:out value="${func.cpf}" /></p>
                       <p>Data de Nasc: <c:out value="${func.datanascimento}" /></p>
                       <p>Sexo: <c:out value="${func.sexo}" /></p>
                       <p>Celular: <c:out value="${func.celular}" /></p>  
                    --%>
                        
                </div>
        </div>

</body>
</html>
