<%-- 
    Document   : ProcurarCliente
    Created on : 25/10/2018, 13:27:36
    Author     : NadsonJR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procurar Cliente</title>
    </head>
    <nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
        <div class="application-container">
		<div class="form-container">
                    <form action = "${pageContext.request.contextPath}/procurarCliente" method = "post">
			<div class="form-header">Procurar Cliente</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Nome:</label>
                              <input type="text" name="nome">
                            </div>

                            </div>
  			</div>
  			<div class="form-button">
                            <button type="submit">Procurar</button>
  			</div>
                        <br>
                        <div>
                            <table class="table">
                                <tr>
                                     <th scope="col">#</th>
                                     <th scope="col">Nome</th>
                                     <th scope="col">CPF</th>
                                     <th scope="col">Email</th>
                                     <th scope="col">Telefone</th>
                                     <th scope="col">Excluir</th>
                                     <th scope="col">Alterar</th>           
                                </tr>
                            <c:forEach items ="${listaClientes}"  var="clientes" >
                                 <tr>
                                     <td><c:out value="${clientes.id}"/></td>
                                     <td><c:out value="${clientes.nome}"/></td>
                                     <td><c:out value="${clientes.cpf}"/></td>
                                     <td><c:out value="${clientes.email}"/></td>
                                     <td><c:out value="${clientes.telefone}"/></td>
                                     <td><a href="ExcluirCliente?idCliente=${clientes.id}">Excluir</a></td>
                                     <td><a href="EditarCliente?idCliente=${clientes.id}">Alterar</a></td>
                                </tr>
                            </c:forEach>     
                            </table>
                        </div>
                    </form>
                </div>
	</div>
    
        
</body>
</html>
