
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
         
    
        <div class="application-container">
		<div class="form-container">
                   
                    <form method="post" action="${pageContext.request.contextPath}/EditarVeiculo">
                        <input type="hidden" name="placa" value="${veiculo.placa}"/>
			<div class="form-header">EDITAR VEÍCULO</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Marca</label>
                              <input type="text" name="txtMarca" value="${veiculo.marca}"> 
                            </div>
                              <div>
                              <label>Modelo</label>
                              <input type="text" name="txtModelo" value="${veiculo.modelo}"> 
                            </div>
                              <div>
                              <label>Categoria</label>
                              <input type="text" name="txtCategoria" value="${veiculo.categoria}"> 
                            </div>
                            <div>
                              <label>Placa</label>
                              <input type="text" name="txtPlaca" readonly value="${veiculo.placa}">
                            </div>
                            <div>
                              <label>Cor</label>
                              <input type="text" name="txtCor" value="${veiculo.cor}">
                            </div>
                        </div>
                        <div class="form-block-row">
                            <div>
                              <label>Ano</label>
                              <input type="text" name="txtAno" value="${veiculo.ano}">
                            </div>
                            <div>
                              <label>Km</label>
                              <input type="text" name="txtKm" value="${veiculo.km}">
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
