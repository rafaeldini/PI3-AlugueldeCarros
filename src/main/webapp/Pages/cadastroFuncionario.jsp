
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
	<meta charset="utf-8">
	<title>Cadastro de Funcionario</title>
</head>
<nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
    <form method="post" action="${pageContext.request.contextPath}/inserirFuncionario">
        <div class="application-container">
		<div class="form-container">
                    <form action = "Cadastro Funcionarios" method = "GET">
			<div class="form-header">CADASTRO DE FUNCIONARIO</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Nome</label>
                              <input type="text" name="nome">
                            </div>  
                            <div>
                              <label>E-MAIL</label>
                              <input type="text" name="email">
                            </div> 
                           
                          </div>
                             <div class="form-block-row">
                            <div>
                              <label>CPF</label>
                              <input type="text" name="cpf">
                            </div>  
                             <div>
                              <label>NASCIMENTO</label>
                              <input type="text" name="DatadeNascimento">
                            </div>
                            <div>
                              <label>CELULAR</label>
                              <input type="text" name="celular">
                            </div>
                                                                      
                                                       
                          </div>
                  
                            <div class="form-block-row">
                                                           
                              <div>
                                  <label>SEXO</label>
                              <select name="selectSexo">
                                <option value="masculino" selected>Masculino</option>
                                <option value="feminino">Feminino</option>
                                <option value="outros">Outros</option>
                                
                              </select>
                            </div>
                                <div>
                                  <label>CARGO</label>
                              <select name="selectCargo">
                                <option value="vendedor" selected>Vendedor</option>
                                <option value="gerente">Gerente</option>
                                <option value="marketing">Marketing</option>
                                 <option value="retaguarda">Retaguarda</option>
                                <option value="administrativo">Admintrativo</option>
                                                                                            
                              </select>
                            </div>                                
                                <div>
                                <label>DEPTO</label>
                              <select name="selectDepto">
                                <option value="vendas" selected>Vendas</option>
                                <option value="marketing">Prod/Serv/Marketing</option>
                                <option value="administrativo">Admintrativo</option>
                                <option value="ti">TI</option>                                                             
                              </select>
                            </div>
                            </div>
                            <div class="form-block-row">
                            <div>
                                  <label>FILIAL</label>
                              <select name="selectFilial">
                                <option value="Sao Paulo" selected>São Paulo</option>
                                <option value="Campina Grande">Campina Grande</option>
                                <option value="Brasilia">Brasilia</option>
                                <option value="Joinville">Joinville</option>
                                
                              </select>
                            </div>
                           </div>
  			</div>
                        <div class="form-block-row">
  			<div class="form-button">
                            <button type="submit">Cadastrar</button>
  			</div>
                        <div class="form-button">
                            <button type="reset">Limpar</button>
  			</div>
                    </form>
                </div>
                        </div>
	</div>
    </form>
</body>
</html>
