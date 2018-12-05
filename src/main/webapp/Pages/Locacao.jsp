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
    <form method="post" action="${pageContext.request.contextPath}/ServletLocacao">
        <div class="application-container">
		<div class="form-container">
			<div class="form-header">SELECIONAR CLIENTE</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                            <table class="table">
                                <tr>
                                     <th scope="col">Nome</th>
                                     <th scope="col">CPF</th>          
                                </tr>
                            <c:forEach items="${listaCliente}"  var="cliente">
                                 <tr>
                                     <td scope="row"> ${cliente.nome}</td>
                                     <td scope="row"> ${cliente.cpf}</td>
                            </div>
                            </c:foreach>
                            </table>
                            <div class="form-block-row">
                            </div>
                            <div class="form-header">SELECIONAR CARRO</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                            <table class="table">
                                <tr>
                                     <th scope="col">Modelo</th>
                                     <th scope="col">Marca</th>
                                     <th scope="col">Placa</th>
                                     <th scope="col">Estado</th>    
                                </tr>
                            <c:forEach items="${listaVeiculo}"  var="veiculo">
                                 <tr>
                                     <td scope="row"> ${veiculo.modelo}</td>
                                     <td scope="row"> ${veiculo.marca}</td>
                                     <td scope="row"> ${veiculo.placa}</td>
                                     <td scope="row"> ${veiculo.ativo}</td>
                                     </div>
                            </c:foreach>
                            </table>
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
    
</body>
</html>
