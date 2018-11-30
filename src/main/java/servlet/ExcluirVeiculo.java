/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.VeiculoDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Veiculo;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "ExcluirVeiculo", urlPatterns = {"/ExcluirVeiculo"})
public class ExcluirVeiculo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String placa = request.getParameter("Placa");

        try {
            VeiculoDAO.deletar(placa);
            List<Veiculo> listaVeiculo = VeiculoDAO.listar();
            request.setAttribute("listaVeiculo", listaVeiculo);

        } catch (Exception e) {
            System.out.println(e);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Pages/ProcurarVeiculo.jsp");
        dispatcher.forward(request, response);
    }
}
