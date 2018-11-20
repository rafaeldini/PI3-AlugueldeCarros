<%-- 
    Document   : Locacao
    Created on : 08/11/2018, 00:28:48
    Author     : Raffael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
	<meta charset="utf-8">
	<title>Locacao</title>
</head>
<nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
    <form method="post" action="${pageContext.request.contextPath}/Locacao">
        <div class="application-container">
		<div class="form-container">
                    <form action = "CadastroClientes" method = "GET">
			<div class="form-header">SELECIONAR CLIENTE</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Nome</label>
                              <input type="text" name="nomeCliente">
                            </div>
                            <div>
                              <label>CPF</label>
                              <input type="text" name="cpfCliente">
                            </div>
   
                            </div>
                            <div class="form-block-row">
                            </div>
                            <div class="form-header">SELECIONAR CARRO</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>PLACA</label>
                              <input type="text" name="nomeCliente">
                            </div>
                          
   
                            </div>
                            <div class="form-block-row">
                            </div>
                            
                          
  			</div>
  			<div class="form-button">
                            <button type="submit">Cadastrar</button>
  			</div>
                        <div class="form-button">
                            <button type="reset">Limpar</button>
  			</div>
                    </form>
                </div>
	</div>
    </form>
</body>
</html>
