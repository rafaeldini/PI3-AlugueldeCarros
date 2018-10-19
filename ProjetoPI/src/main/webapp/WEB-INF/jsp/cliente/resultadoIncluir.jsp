<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cliente - Cadastro</title>
    </head>

    <body>
        <h1>Foi Cadastrado</h1>
        <h2>Resultado:</h2>


        <p>Nome: <c:out value="${cliente.nome}" /></p>
        <p>data: <c:out value="${cliente.datanascimento}" /></p>
        <p>numhab: <c:out value="${cliente.numhab}" /></p>
        <p>cpf: <c:out value="${cliente.cpf}" /></p>
        <p>rg: <c:out value="${cliente.rg}" /></p>
        <p>estadoCivil: <c:out value="${cliente.estadocivil}" /></p>
        <p>cep: <c:out value="${cliente.cep}" /></p>
        <p>logradouro: <c:out value="${cliente.logradouro}" /></p>
        <p>numero: <c:out value="${cliente.numero}" /></p>
        <p>complemento: <c:out value="${cliente.complemento}" /></p>
        <p>cidade: <c:out value="${cliente.cidade}" /></p>
        <p>bairro: <c:out value="${cliente.bairro}" /></p>
        <p>estado: <c:out value="${cliente.estado}" /></p>
        <p>telefone: <c:out value="${cliente.telefone}" /></p>
        <p>celular: <c:out value="${cliente.celular}" /></p>
        <p>email: <c:out value="${cliente.email}" /></p>
        <p>Sexo: <c:out value="${cliente.sexo}" /></p>
        <p><a href="http://localhost:8080/ProjetoPI/cliente/incluir">Voltar</a></p>



    </body>
</html>
