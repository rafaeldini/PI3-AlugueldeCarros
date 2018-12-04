

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procurar Veículo</title>  
    </head>
        <nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
    <body>
        <div class="application-container">
		<div class="form-container">
                    <form action="${pageContext.request.contextPath}/ProcurarVeiculo" method="post">
			<div class="form-header">Procurar Veículo</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Placa</label>
                              <input type="text" name="txtPlaca">
                            </div>
                            </div>
  			</div>
  			<div class="form-button">
                            <button type="submit">Procurar</button>
  			</div>
                        <br>
                        </form>
                        <div>
                            <table class="table">
                                <tr>
                                     <th scope="col">Placa</th>
                                     <th scope="col">Modelo</th>
                                     <th scope="col">Marca</th>
                                     <th scope="col">Ano</th>
                                     <th scope="col">KM</th>
                                     <th scope="col"></th>
                                     <th scope="col"></th>    
                                              
                                </tr>
                            <c:forEach items="${listaVeiculo}"  var="veiculo">
                                 <tr>
                                     <td scope="row"> ${veiculo.placa}</td>
                                     <td scope="row"> ${veiculo.modelo}</td>
                                     <td scope="row"> ${veiculo.marca}</td>
                                     <td scope="row"> ${veiculo.ano}</td>
                                     <td scope="row"> ${veiculo.km}</td>
                                      
                                 <form action="${pageContext.request.contextPath}/ExcluirVeiculo" method="post">
                                     <input type="hidden" name="Placa" value="${veiculo.placa}">
                                     <td><button type="submit">EXCLUIR</button> </td>
                                     </form>
                                 <form action="${pageContext.request.contextPath}/EditarVeiculo" method="get">
                                     <input type="hidden" name="txtPlaca" value="${veiculo.placa}">
                                     <td><button type="submit">ALTERAR</button> </td>
                                   </form>
                                </tr>
                            </c:forEach>     
                            </table>
                        </div>
                    
                </div>
	</div>
    
        
    </body>
</html>
