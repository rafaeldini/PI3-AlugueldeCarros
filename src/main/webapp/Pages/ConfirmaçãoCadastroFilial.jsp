<%-- 
    Document   : ConfirmaçãoCadastroFilial
    Created on : 19/11/2018, 21:42:10
    Author     : nadso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Completo</title>
    </head>
      <body>
   
        <div class="application-container">
		<div class="form-container">
                    <form method="get" action="/locacaoTADS/Home">
			<div class="form-header">CADASTRADO COM SUCESSO</div>
			<div class="form-button">
                            <button type="submit">Voltar</button>
  			</div>
                    </form>       
                     <%--   <p>Nome: <c:out value="${func.nome}" /></p>
                       <p>CPF: <c:out value="${func.cpf}" /></p>
                       <p>Data de Nasc: <c:out value="${func.datanascimento}" /></p>
                       <p>Sexo: <c:out value="${func.sexo}" /></p>
                       <p>Celular: <c:out value="${func.celular}" /></p>  
                    --%>
                        
                </div>
        </div>

</body>
</html>
