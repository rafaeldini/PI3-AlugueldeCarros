/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nadso
 */
@WebServlet(name = "FormularioInserirFuncionario", urlPatterns = {"/inserirFuncionario"})
public class InserirFuncionario extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/cadastroFuncionario.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String sexo = (String) request.getParameter("sexo");
        String datanascimento = request.getParameter("datanascimento");
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String estadocivil = request.getParameter("estadocivil");
        String cep = request.getParameter("cep");
        String logradouro = request.getParameter("logradouro");
        String numero = request.getParameter("numero");
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String bairro = request.getParameter("bairro");
        String estado = request.getParameter("estado");
        String telefone = request.getParameter("telefone");
        String celular = request.getParameter("celular");
        String email = request.getParameter("email");
     

        
       


        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/Pages/cadastroFuncionario.jsp");
        dispatcher.forward(request, response);

    }
}