<%-- 
    Document   : confirmacaoCadastro
    Created on : 20/11/2018, 00:11:48
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
	<title>Cadastro de Filial</title>
</head>
<nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
   
        <div class="application-container">
		<div class="form-container">
                   
			<div class="form-header">CADASTRADO COM SUCESSO</div>
			<div class="form-content">
                        <div class="form-block-row">
                           
                     <%--   <p>Nome: <c:out value="${func.nome}" /></p>
                       <p>CPF: <c:out value="${func.cpf}" /></p>
                       <p>Data de Nasc: <c:out value="${func.datanascimento}" /></p>
                       <p>Sexo: <c:out value="${func.sexo}" /></p>
                       <p>Celular: <c:out value="${func.celular}" /></p>  
                    --%>
                        </div>
  			</div>
                </div>
        </div>

</body>
</html>
