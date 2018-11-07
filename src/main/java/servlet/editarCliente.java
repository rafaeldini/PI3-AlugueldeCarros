/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
        
        Cliente cliente = null;
        String nome= request.getParameter("nome");
        
        try{
            cliente = ClienteDAO.procurar(nome);
            request.setAttribute("nome", cliente.getNome());
            request.setAttribute("sexo", cliente.getSexo());
            request.setAttribute("datanascimente", cliente.getDatanascimento());
            request.setAttribute("cpf", cliente.getCpf());
            request.setAttribute("rg", cliente.getRg());
            request.setAttribute("cep", cliente.getCep());
            request.setAttribute("logradouro", cliente.getLogradouro());
            request.setAttribute("numero", cliente.getNumero());
            request.setAttribute("complemento", cliente.getComplemento());
            request.setAttribute("cidade", cliente.getCidade());
            request.setAttribute("bairro", cliente.getBairro());
            request.setAttribute("estado", cliente.getEstado());
            request.setAttribute("telefone", cliente.getTelefone());
            request.setAttribute("celular", cliente.getCelular());
            request.setAttribute("email", cliente.getEmail());
            request.setAttribute("numhab", cliente.getNumHab());
            
            this.getServletContext().getRequestDispatcher("/editarCliente.jsp").forward(request, response);
            
        }catch(Exception e ){
            
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        }

    
}
