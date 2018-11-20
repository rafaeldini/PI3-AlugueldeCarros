<%-- 
    Document   : EditarCliente
    Created on : 06/11/2018, 22:51:53
    Author     : NadsonJR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Cliente</title>
    </head>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/editarCliente">
        <div class="application-container">
		<div class="form-container">
                    <form action = "CadastroClientes" method = "GET">
			<div class="form-header">EDITAR DADOS</div>
			<div class="form-content">
                        <div class="form-block-row">
                            <div>
                              <label>Nome:</label>
                              <input type="text" name="nome" value="${nome}">
                            </div>
                            <div>
                              <label>NASCIMENTO</label>
                              <input type="text" name="DatadeNascimento" value="${dataNascimento}">
                            </div>
                            <div>
                              <label>RG</label>
                              <input type="text" name="RG" value="${rg}">
                            </div>
                        </div>
                        <div class="form-block-row">
                            <div>
                              <label>CPF</label>
                              <input type="text" name="cpf" value="${cpf}">
                            </div>
                            <div>
                              <label>SEXO</label>
                              <input type="text" name="sexo" value="${sexo}">
                            </div>
                            <div>
                              <label>TELEFONE</label>
                              <input type="text" name="telefone" value="${telefone}">
                            </div>
                        </div>
                            <div class="form-block-row">
                                <div>
                              <label>CELULAR</label>
                              <input type="text" name="celular" value="${celular}">
                            </div>
                            <div>
                              <label>E-MAIL</label>
                              <input type="text" name="email" value="${email}">
                            </div>
                            <div>
                              <label>CEP</label>
                              <input type="text" name="cep" value="${cep}">
                            </div>
                            </div>
                            <div class="form-block-row">
                                <div>
                              <label>LOGRADOURO</label>
                              <input type="text" name="logradouro" value="${logradouro}">
                            </div>
                            <div>
                              <label>NÚMERO</label>
                              <input type="text" name="numero" value="${numero}">
                            </div>
                            <div>
                              <label>COMPLEMENTO</label>
                              <input type="text" name="complemento" value="${complemento}">
                            </div>
                            </div>
                            
                            <div class="form-block-row">
                            <div>
                              <label>BAIRRO</label>
                              <input type="text" name="bairro" value="${bairro}">
                            </div>
                            <div>
                              <label>CIDADE</label>
                              <input type="text" name="cidade" value="${cidade}">
                            </div>
                            <div>
                              <label>ESTADO</label>
                              <input type="text" name="estado" value="${estado}">
                            </div>
                            </div>
  			</div>
  			<div class="form-button">
                            <button type="submit">Salvar</button>
  			</div>
                    </form>
                </div>
	</div>
    </form>
    </body>
</html>
