/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Veiculo;
import dao.VeiculoDAO;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "EditarVeiculo", urlPatterns = {"/EditarVeiculo"})
public class EditarVeiculo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        try {
            String placa = request.getParameter("placa");
           Veiculo veiculo =  VeiculoDAO.procurar(placa);
           request.setAttribute("veiculo", veiculo);
           
        } catch (Exception e) {

        }
        
       RequestDispatcher dispatcher = request.getRequestDispatcher("/Pages/EditarVeiculo.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
