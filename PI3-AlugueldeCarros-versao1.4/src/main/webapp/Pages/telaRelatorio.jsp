<%-- 
    Document   : telaRelatorio
    Created on : 20/11/2018, 19:40:36
    Author     : victo
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
        <title>Relatório</title>
    </head>
    <nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
        <div class="application-container">
		<div class="form-container">
                    <form action = "${pageContext.request.contextPath}/emitirRelatorio" method = "post">
			<div class="form-header">Relatório</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Data:</label>
                              <input type="text" name="data">
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
                                     <th scope="col">Cod Locação</th>
                                     <th scope="col">Cliente</th>
                                     <th scope="col">CPF Cliente</th>
                                     <th scope="col">Data</th>
                                     <th scope="col">Funcinário</th>
                                     <th scope="col">Forma Pagamento</th>
                                     <th scope="col">Valor</th>
                                     <th scope="col">Filial</th>
                                     
                                </tr>
                            <c:forEach items ="${listaLocacao}"  var="relatorio" >
                                 <tr>
                                     <td><c:out value="sem dados"/></td>
                                     <td><c:out value="sem dados"/></td>
                                     <td><c:out value="sem dados"/></td>
                                     <td><c:out value="sem dados"/></td>
                                     <td><c:out value="sem dados"/></td>
                                     <td><c:out value="sem dados"/></td>
                                     <td><c:out value="sem dados"/></td>
                                </tr>
                            </c:forEach>     
                            </table>
                        </div>
                    
                </div>
	</div>
    
        
</body>
</html>
