<%-- 
    Document   : CadastroCliente
    Created on : 24/10/2018, 01:28:05
    Author     : nadso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
	<meta charset="utf-8">
	<title>Cadastro de clientes</title>
</head>
<nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
    <form method="post" action="${pageContext.request.contextPath}/inserirCliente">
        <div class="application-container">
		<div class="form-container">
                    <form action = "Cadastro Clientes" method = "GET">
			<div class="form-header">CADASTRO DE CLIENTES</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Nome:</label>
                              <input type="text" name="nome">
                            </div>
                            <div>
                                  <label>Sexo:</label>
                              <select name="selectSexo">
                                <option value="masculino" selected>Masculino</option>
                                <option value="feminino">Feminino</option>
                                <option value="outros">Outros</option>
                                
                              </select>
                            </div>
                            <div>
                              <label>Data de Nascimento:</label>
                              <input type="text" name="datadenascimento">
                            </div>
                        </div>
                        <div class="form-block-row">
                            <div>
                              <label>CPF:</label>
                              <input type="text" name="cpf">
                            </div>
                            <div>
                              <label>Logradouro:</label>
                              <input type="text" name="logradouro">
                            </div>
                            <div>
                              <label>Número:</label>
                              <input type="text" name="numero">
                            </div>
                        </div>
                            <div class="form-block-row">
                                <div>
                              <label>Complemento:</label>
                              <input type="text" name="complemento">
                            </div>
                            <div>
                              <label>Cidade:</label>
                              <input type="text" name="cidade">
                            </div>
                            <div>
                              <label>Bairro:</label>
                              <input type="text" name="bairro">
                            </div>
                            </div>
                            <div class="form-block-row">
                                <div>
                              <label>Estado:</label>
                              <input type="text" name="estado">
                            </div>
                            <div>
                              <label>Celular:</label>
                              <input type="text" name="celular">
                            </div>
                            <div>
                              <label>E-mail:</label>
                              <input type="text" name="email">
                            </div>
                            </div>
                            
                            <div class="form-block-row">
                            <div>
                              <label>Número Da Habilitação: </label>
                              <input type="text" name="numhab">
                            </div>
                            </div>
  			</div>
  			<div class="form-button">
                            <button type="submit">Salvar</button>
  			</div>
                       
                    </form>
                </div>
	</div>
    </form>
</body>
</html>
