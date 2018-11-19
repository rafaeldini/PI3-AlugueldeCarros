<%-- 
    Document   : ConfirmaçãoCadastroFilial
    Created on : 19/11/2018, 21:42:10
    Author     : nadso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Completo</title>
    </head>
      <body>
        <h1>Foi Cadastrado</h1>
        <h2>Resultado:</h2>
        <p>CNPJ: <c:out value="${filial.cnpj}" /></p>
        <p>Razão: <c:out value="${filial.razao}" /></p>
        <p>UF: <c:out value="${filial.uf}" /></p>
        <p>Cidade: <c:out value="${filial.cidade}" /></p>
        <p>Responsável: <c:out value="${filial.resp}" /></p>
    </body>
</html>
