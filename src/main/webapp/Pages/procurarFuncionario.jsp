<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Funcionario</title>
    </head>
    <nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
        <div class="application-container">
		<div class="form-container">
                    <form action = "${pageContext.request.contextPath}/procurarFuncionario" method = "post">
			<div class="form-header">Consultar Funcionario</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Nome:</label>
                              <input type="text" name="nome">
                              <div>
                                  <label>CPF:</label>&nbsp;&nbsp;&nbsp;&nbsp;
                              <input type="text" name="cpf">
                              
                            <c:if test="${cpf == funcionario.getCpf}">
                            <div class="form-block-row">
                            <h2><c:out value="${funcionario.getNome}" /></h2>
                            <p><c:out value="${funcionario.getCpf}" /></p>
                            </div>
                            </c:if>
                            
                              </div>
                            </div>
                            <div class="form-button">
                            <button type="button" onClick="c:">Procurar</button>
  			</div>
                            

                            </div>
  			</div>
  			
                        </form>
                        <br>
                        <div>
                            <table class="table">
                                <tr>
                                     <th scope="col">FILIAL</th>
                                     <th scope="col">NOME</th>
                                     <th scope="col">CPF</th>
                                     <th scope="col">USERNAME</th>
                                </tr>
                            <c:forEach items ="${listaFuncionarios}"  var="funcionario" >
                                 <tr>
                                     <td><c:out value="${funcionario.getFilial()}"/></td>
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
