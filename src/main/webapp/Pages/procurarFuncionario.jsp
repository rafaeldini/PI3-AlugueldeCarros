
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procurar Funcionario</title>
    </head>
    <nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
        <div class="application-container">
		<div class="form-container">
                    <form action = "${pageContext.request.contextPath}/procurarFuncionario" method = "post">
			<div class="form-header">Procurar Funcionario</div>
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
                                     <th scope="col">Username</th>
                                </tr>
                            <c:forEach items ="${listaFuncionarios}"  var="funcionario" >
                                 <tr>
                                     <td><c:out value="${funcionario.getNome()}"/></td>
                                     <td><c:out value="${funcionario.getCpf()}"/></td>
                                     <td><c:out value="${funcionario.getUsername()}"/></td>
                                </tr>
                            </c:forEach>     
                            </table>
                        </div>
                    
                </div>
	</div>
    
        
</body>
</html>
