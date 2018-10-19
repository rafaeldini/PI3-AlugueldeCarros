/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.projetopi.projetopi;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author Rafael
 */

@WebServlet(name = "ListaCliente", urlPatterns = {"/cliente/lista"})
public class ListaCliente extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
          
         List<Cliente> listaClientes = null;        
        try {
            listaClientes = DaoCliente.listar();
        } catch (Exception ex) {
             
        }
       

        request.setAttribute("Cliente", listaClientes);

        // dispacher com o endereço da pagina
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/cliente/listaCliente.jsp");

        dispatcher.forward(request, response);
    }
}
