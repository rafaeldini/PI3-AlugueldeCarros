
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles/Login.css">
        <link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Veículo</title>
    </head>
    <nav>
        <div><jsp:include page="navbar.jsp"/></div> 
    </nav>
    <body>
    <form method="post" action="${pageContext.request.contextPath}/EditarVeiculo">
        <div class="application-container">
		<div class="form-container">
                    <form action = "EditarVeiculo" method = "get">
			<div class="form-header">EDITAR VEÍCULO</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Modelo</label>
                              <input type="text" name="modelo" value="${veiculo.modelo}"> 
                            </div>
                            <div>
                              <label>Placa</label>
                              <input type="text" name="placa" value="${veiculo.placa}">
                            </div>
                            <div>
                              <label>Cor</label>
                              <input type="text" name="cor" value="${veiculo.cor}">
                            </div>
                        </div>
                        <div class="form-block-row">
                            <div>
                              <label>Ano</label>
                              <input type="text" name="ano" value="${veiculo.ano}">
                            </div>
                            <div>
                              <label>Km</label>
                              <input type="text" name="km" value="${veiculo.km}">
                            </div>
                        </div>
                            <div class="form-block-row">
                                <div>
                              <label>IMAGEM</label>
                              <img id="carImg" src="BG.jpg">
                            </div>
                                
                            </div>    
                            
  			</div>
  			<div class="form-button">
                            <button type="submit">Salvar</button>
  			</div>
                        <div class="form-button">
                            <button type="reset">Limpar</button>
  			</div>
                    </form>
                </div>
	</div>
    </form>
    </body>
</html>
