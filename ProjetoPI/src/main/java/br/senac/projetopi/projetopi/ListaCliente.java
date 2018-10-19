/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.projetopi.projetopi;

import br.senac.projetopi.projetopi.DaoCliente;
import br.senac.projetopi.projetopi.Cliente;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "ListaCliente", urlPatterns = {"/cliente/lista"})
public class ListaCliente {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {
            List<Cliente> listaClientes = DaoCliente.listar();

        } catch (Exception e) {

        }

        //request.setAttribute("Cliente", listaClientes);

        // dispacher com o endereço da pagina
        RequestDispatcher dispatcher = request.getRequestDispatcher("/lista-pacientes.jsp");

        dispatcher.forward(request, response);
    }
}
