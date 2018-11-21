<%-- 
    Document   : CadastroFilial
    Created on : 19/11/2018, 20:55:17
    Author     : nadson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Filial</title>
    </head>
    <nav>
        <div><jsp:include page="navbar.jsp"/></div>
    </nav>
    <body>
    <form method="post" action="${pageContext.request.contextPath}/inserirFilial">
        <div class="application-container">
		<div class="form-container">
                    <form action = "Cadastro Funcionarios" method = "GET">
			<div class="form-header">CADASTRO DE FILIAL</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>CNPJ:</label>
                              <input type="text" name="cnpj">
                            </div>  
                            <div>
                              <label>Razão:</label>
                              <input type="text" name="razao">
                            </div>
                            <div>
                              <label>UF</label>
                              <input type="text" name="UF">
                            </div>
                          </div>
                             <div class="form-block-row">
                              
                             <div>
                              <label>Cidade:</label>
                              <input type="text" name="cidade">
                            </div>
                            <div>
                              <label>Responsavél:</label>
                              <input type="text" name="resp">
                            </div>                                                                                 
                          </div>
  			<div class="form-button">
                            <button type="submit">Cadastrar</button>
                            
  			</div>
                    </form>
                </div>
            </div>
	</div>
    </form>
</body>
</html>
