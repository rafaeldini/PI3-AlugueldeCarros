<%-- 
    Document   : editarFilial
    Created on : 06/12/2018, 01:15:03
    Author     : nadso
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
			<div class="form-header">EDIÇÃO DE FILIAL</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>CNPJ:</label>
                              <input type="text" name="cnpj" value="${filial.getcnpj}">
                            </div>  
                            <div>
                              <label>Razão:</label>
                              <input type="text" name="razao" value="${filial.getrazao}">
                            </div>
                            <div>
                              <label>UF</label>
                              <input type="text" name="UF" value="${filial.getuf}">
                            </div>
                          </div>
                             <div class="form-block-row">
                              
                             <div>
                              <label>Cidade:</label>
                              <input type="text" name="cidade"value="${filial.getcidade}">
                            </div>
                            <div>
                              <label>Responsavél:</label>
                              <input type="text" name="resp" value="${filial.getresp}">
                            </div>                                                                                 
                          </div>
  			<div class="form-button">
                            <button type="submit">Editar</button>
                            
  			</div>
                    </form>
                </div>
            </div>
	</div>
    </form>
</body>
</html>
