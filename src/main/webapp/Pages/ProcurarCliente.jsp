<%-- 
    Document   : ProcurarCliente
    Created on : 25/10/2018, 13:27:36
    Author     : NadsonJR
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
                        </form>
                        <br>
                        <div>
                            <table class="table">
                                <tr>    
                                     <th scope="col">Nome</th>
                                     <th scope="col">CPF</th>
                                     <th scope="col">Email</th>
                                     <th scope="col">Opção</th>
                                     <th scope="col"></th>
                                </tr>
                            <c:forEach items ="${listaClientes}"  var="cliente" >
                                 <tr>
                                     <td><c:out value="${cliente.getNome()}"/></td>
                                     <td><c:out value="${cliente.getCpf()}"/></td>
                                     <td><c:out value="${cliente.getEmail()}"/></td>
                                     <td>
                                         <form method="get" action="${pageContext.request.contextPath}/editarCliente">
                                             <input type="hidden" value="${cliente.getID()}" name="id">
                                             <button type="submit"> Alterar</button>
                                        </form>
                                     </td>
                                     <td>
                                        <form action= "${pageContext.request.contextPath}/ExcluirCliente" method="post">
                                            <input type="hidden" name="id" value="${cliente.ID}">
                                            <button type="submit">Excluir</button>
                                        </form>
                                     </td>    
                                </tr>
                            </c:forEach>     
                            </table>
                        </div>
                    
                </div>
	</div>
    
        
</body>
</html>
