<%-- 
    Document   : funcionarioCadastrado
    Created on : 16/11/2018, 18:58:22
    Author     : Matheus
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
	<meta charset="utf-8">
	<title>Cadastro de Funcionario</title>
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
                           
                       <p>Nome: <c:out value="${func.nome}" /></p>
                       <p>CPF: <c:out value="${func.cpf}" /></p>
                       
                    
                        </div>
  			</div>
                </div>
        </div>

</body>
</html>
