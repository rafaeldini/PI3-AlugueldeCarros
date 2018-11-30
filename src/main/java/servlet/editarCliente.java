/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.ClienteDAO;
import static dao.ClienteDAO.procurarCpf;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;

/**
 *
 * @author NadsonJR
 */
@WebServlet(name = "editarCliente", urlPatterns = {"/editarCliente"})
public class editarCliente extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        int ID = Integer.parseInt(request.getParameter("id"));   
        Cliente c =null; 
        try {
            c = ClienteDAO.procurarId(ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("id", ID);
        request.setAttribute("cliente", c);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/editarCliente.jsp");
        dispatcher.forward(request, response);
    
    }
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String nome = request.getParameter("nome");
                String sexo = request.getParameter("sexo");
                String datanascimento = request.getParameter("datNasc");
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
            System.out.println("AlterarCliente POST");
            ClienteDAO.AlterarCliente(c,cpf);
        } catch (Exception e) {
        }
         RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/editarCliente.jsp");
        dispatcher.forward(request, response);
        }

    
}
