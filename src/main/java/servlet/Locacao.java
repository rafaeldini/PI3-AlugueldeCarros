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
@WebServlet(name = "Locacao", urlPatterns = {"/Locacao"})
public class Locacao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/Locacao.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nomeCliente");
        String cpf = request.getParameter("cpfCliente");

        try {

            ClienteDAO.procurar(nome);
            ClienteDAO.procurarCpf(cpf);

        } catch (Exception e) {

        }
      //  request.setAttribute("cliente", c);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/Pages/Locacao.jsp");
        dispatcher.forward(request, response);

    }
}
