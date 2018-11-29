<%-- 
    Document   : EditarCliente
    Created on : 06/11/2018, 22:51:53
    Author     : NadsonJR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Cliente</title>
    </head>
    <nav>
        <div><jsp:include page="navbar.jsp"/></div> 
    </nav>
   <body>
    <form method="post" action="${pageContext.request.contextPath}/editarCliente">
        <div class="application-container">
		<div class="form-container">
                        <div class="form-header">EDIÇÃO DE CLIENTES</div>
			<div class="form-content">   
                        <div class="form-block-row">
                            <div>
                              <label>Nome:</label>
                              <input type="text" name="nome" value="${cliente.Nome}">
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
                              <input type="text" name="datadenascimento" value="${cliente.DatNasc}">
                            </div>
                        </div>
                        <div class="form-block-row">
                            <div>
                              <label>CPF:</label>
                              <input type="text" name="cpf" value="${cliente.CPF}">
                            </div>
                            <div>
                              <label>Logradouro:</label>
                              <input type="text" name="logradouro" value="${cliente.Logradouro}">
                            </div>
                            <div>
                              <label>Número:</label>
                              <input type="text" name="numero" value="${cliente.Numero}">
                            </div>
                        </div>
                            <div class="form-block-row">
                                <div>
                              <label>Complemento:</label>
                              <input type="text" name="complemento" value="${cliente.Complemento}">
                            </div>
                            <div>
                              <label>Cidade:</label>
                              <input type="text" name="cidade" value="${cliente.Cidade}">
                            </div>
                            <div>
                              <label>Bairro:</label>
                              <input type="text" name="bairro" value="${cliente.Bairro}">
                            </div>
                            </div>
                            <div class="form-block-row">
                                <div>
                              <label>Estado:</label>
                              <input type="text" name="estado" value="${cliente.Estado}">
                            </div>
                            <div>
                              <label>Celular:</label>
                              <input type="text" name="celular" value="${cliente.Celular}">
                            </div>
                            <div>
                              <label>E-mail:</label>
                              <input type="text" name="email" value="${cliente.Email}">
                            </div>
                            </div>
                            
                            <div class="form-block-row">
                            <div>
                              <label>Número Da Habilitação: </label>
                              <input type="text" name="numhab" value="${cliente.NumHab}">
                            </div>
                            </div>
  			</div>
  			<div class="form-button">
                            <button type="submit">Salvar</button>
  			</div>
                </div>
	</div>
    </form>
</body>
</html>
