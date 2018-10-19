<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
    </head>
    <body>

        <h1>Lista de Clientes</h1>
        <table border="1">
            
              <tr>
                <td>Nome</td>
                <td>Data Nascimento</td>
                <td>Habilitação</td>
                <td>CPF</td>
                <td>RG</td>
                <td>Estado Civil</td>
                <td>CEP</td>
                <td>Logradouro</td>
                <td>Numero</td>
                <td>Complemento</td>
                <td>Cidade</td>
                <td>Bairro</td>
                <td>Estado</td>
                <td>Telefone</td>
                <td>Celular</td>
                <td>Email</td>
                <td>Sexo</td>
            </tr>
            
                <c:forEach items="${Cliente}" var="cliente">
                <tr>
                <td><c:out value="${cliente.nome}" />&nbsp;&nbsp;&nbsp;</td>
                <td> <c:out value="${cliente.datanascimento}" />&nbsp;&nbsp;&nbsp;</td>
                <td> <c:out value="${cliente.numhab}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.cpf}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.rg}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.estadocivil}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.cep}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.logradouro}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.numero}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.complemento}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.cidade}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.bairro}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.estado}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.telefone}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.celular}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.email}" />&nbsp;&nbsp;&nbsp;</td>
                <td><c:out value="${cliente.sexo}" />&nbsp;&nbsp;&nbsp;</td>
                </td>

        </c:forEach>
    
</table>
</body>
</html>
