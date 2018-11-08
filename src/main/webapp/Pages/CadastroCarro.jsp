<%-- 
    Document   : CadastroCarro
    Created on : 30/10/2018, 22:44:57
    Author     : NadsonJR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
	<meta charset="utf-8">
	<title>Cadastro de Veículos</title>
</head>
<nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
    <form method="post" action="${pageContext.request.contextPath}/incluirCarro">
        <div class="application-container">
		<div class="form-container">
                    <form action = "CadastroClientes" method = "GET">
			<div class="form-header">CADASTRO DE VEÍCULO</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Modelo</label>
                              <input type="text" name="modelo">
                            </div>
                            <div>
                              <label>Placa</label>
                              <input type="text" name="placa">
                            </div>
                            <div>
                              <label>Cor</label>
                              <input type="text" name="cor">
                            </div>
                        </div>
                        <div class="form-block-row">
                            <div>
                              <label>Ano</label>
                              <input type="text" name="ano">
                            </div>
                            <div>
                              <label>Km</label>
                              <input type="text" name="km">
                            </div>
                        </div>
                            <div class="form-block-row">
                                <div>
                              <label>IMAGEM</label>
                              <img id="carImg" src="BG.jpg">
                            </div>
                                
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

