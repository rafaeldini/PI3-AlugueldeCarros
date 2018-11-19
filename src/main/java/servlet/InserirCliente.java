/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.ClienteDAO;
import model.Cliente;
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
@WebServlet(name = "FormularioInserirCliente", urlPatterns = {"/inserirCliente"})
public class InserirCliente extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/CadastroCliente.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

       
        String nome = request.getParameter("nome");
        String sexo = request.getParameter("selectSexo");
        String datanascimento = request.getParameter("datadeNascimento");
        String cpf = request.getParameter("cpf");
        String logradouro = request.getParameter("logradouro");             
        String numero = request.getParameter("numero");
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String bairro = request.getParameter("bairro");
        String estado = request.getParameter("estado");
        String celular = request.getParameter("celular");
        String email = request.getParameter("email");
        String numhab = request.getParameter("numhab");
              
        Cliente c = new Cliente(logradouro, numero, complemento, cidade, bairro, estado, numhab, nome, sexo, datanascimento, cpf, celular, celular, email, true);
           
        try {
        
            ClienteDAO.inserir(c);
        
        }catch(Exception e){
            
            e.getLocalizedMessage();
            System.out.println(e);
        
        }
        request.setAttribute("cliente",c);


        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/Pages/ClienteCadastrado.jsp");
        dispatcher.forward(request, response);

    }
}
