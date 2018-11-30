<%-- 
    Document   : EditadoComSucesso
    Created on : 30/11/2018, 03:00:19
    Author     : nadso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="Styles/Cadastros.css">
	<meta charset="utf-8">
	<title>Editado Com sucesso</title>
</head>
<nav>
   <div><jsp:include page="navbar.jsp"/></div> 
</nav>
<body>
   
        <div class="application-container">
		<div class="form-container">
                    <form method="get" action="/locacaoTADS/Home">
			<div class="form-header">EDITADO COM SUCESSO</div>
			<div class="form-button">
                            <button type="submit">Voltar</button>
  			</div>
                    </form>       
                        
                </div>
        </div>

</body>
</html>
