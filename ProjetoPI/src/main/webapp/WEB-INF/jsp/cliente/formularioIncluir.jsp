<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cliente - Cadastro</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1 align="center">INSERIR</h1>
		<hr>
		
        
            <form method="post" action="${pageContext.request.contextPath}/cliente/incluir">
	
				
			
			<table width="100" border="0">
  <tbody>
    <tr>
      <td> 
            <label> Nome Completo </label>		
            <input type="text" id="nome" name="nome"/></td>
              
			 	
      <td><label> Data de Nascimento </label>
            <input type="text" id="datanascimento" name="datanascimento"/></td>
      
    </tr>
    <tr>
      <td><label> numhab </label>
           	<input type="text" id="numhab" name="numhab"/></td>
      <td><label> CPF </label>
            <input type="text" id="cpf" name="cpf"/>	</td>
      <td><label> RG </label>
            <input type="text" id="rg" name="rg"/></td>
    </tr>
    <tr>

      <td><label> Número </label>
            <input type="text" id="numero" name="numero"/></td>
      <td><label> CEP </label>
            <input type="text" id="cep" name="cep"/></td>
		<td><label> logradouro </label>
            <input type="text" id="logradouro" name="logradouro"/></td>
    </tr>
    <tr>
			         		       
      <td><label> Estado </label>
            <input type="text" id="estado" name="estado"/></td>
      <td><label> Cidade </label>
            <input type="text" id="cidade" name="cidade"/></td>
      <td><label> Bairro </label>
            <input type="text" id="bairro" name="bairro"/></td>
      
       
    </tr>
    <tr>
      <td><label> Telefone Fixo </label>
            <input type="text" id="telefone" name="telefone"/>
		
			
      <td>	<label> Telefone Celular </label>
            <input type="text" id="celular" name="celular"/> </td>
      <td><label> Email </label>
            <input type="text" id="email" name="email"/></td></td>
    </tr>
    <tr>
      <td><label> Estado Civil </label>
            <input type="text" id="estadocivil" name="estadocivil"/>
          	</td>
		<td><label> complemento </label>
            <input type="text" id="complemento" name="complemento"/></td>
      
                <td><label> Sexo  </label><br>
         	   <select id="sexo" name="sexo" >
                <option value="Masculino">Masculino</option>
                <option value="Feminino">Feminino</option>
                <option value="Outros">Outros</option>
           	   </select></td>
    </tr>
    <tr>
      <td></td>
    </tr>
			
  </tbody>
</table>
		<button type="submit">Salvar</button>
      <button type="reset">Resetar</button>	
            </form><br>
	<center>
			<a href="menu.jsp">MENU PRINCIPAL</a>
	</center>
        
    </body>
</html>
