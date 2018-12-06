/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
 * @author antonio.ncgjunior
 */
@WebServlet(name = "ExcluirCliente", urlPatterns = {"/ExcluirCliente"})
public class ExcluirCliente extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/procurarCliente.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int IdCliente = Integer.parseInt(request.getParameter("id"));
        System.out.println("veio");
        try {
            ClienteDAO.delCliente(IdCliente);
            List<Cliente> listaCliente = ClienteDAO.listar();
            request.setAttribute("listaCliente", listaCliente);

        } catch (Exception e) {
            System.out.println("oi "+e);
        }
         RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/ExcluidoComSucesso.jsp");
        dispatcher.forward(request, response);  
    }

}


