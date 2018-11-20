

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
                    <form action = "${pageContext.request.contextPath}/ProcurarVeiculo" method = "post">
			<div class="form-header">Procurar Veículo</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Placa</label>
                              <input type="text" name="placa">
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
                                     <th scope="col">Placa</th>
                                     <th scope="col">Modelo</th>
                                     <th scope="col">Marca</th>
                                     <th scope="col">Ano</th>
                                     <th scope="col">KM</th>
                                     <th scope="col">Excluir</th>
                                     <th scope="col">Alterar</th>           
                                </tr>
                            <c:forEach items ="${listaVeiculo}"  var="veiculo" >
                                 <tr>
                                     <td>${veiculo.placa}</td>
                                     <td>${veiculo.modelo}</td>
                                     <td>${veiculo.marca}</td>
                                     <td>${veiculo.ano}</td>
                                     <td>${veiculo.km}</td>
                                     <td><a href="ExcluirVeiculo?placa=${veiculo.placa}">Excluir</a></td>
                                     <td><a href="EditarVeiculo?placa=${veiculo.placa}">Alterar</a></td>
                                </tr>
                            </c:forEach>     
                            </table>
                        </div>
                    </form>
                </div>
	</div>
    
        
    </body>
</html>
