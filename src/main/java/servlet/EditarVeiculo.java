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
        Veiculo v = null;
        String placa = request.getParameter("txtPlaca");

        try {
            v = VeiculoDAO.procurar(placa);

        } catch (Exception e) {
            System.out.println(e);
        }
        request.setAttribute("placa", placa);
        request.setAttribute("veiculo", v);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Pages/EditarVeiculo.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String placa = request.getParameter("txtPlaca");
        String cor = request.getParameter("txtCor");
        String modelo = request.getParameter("txtModelo");
        String ano = request.getParameter("txtAno");
        String marca = request.getParameter("txtMarca");
        String categoria = request.getParameter("txtCategoria");
        String km = request.getParameter("txtKm");
        
        
        
        Veiculo v = new Veiculo(placa, cor, ano, marca, modelo, categoria, km);
        
        try{
            VeiculoDAO.atulizar(v);
            VeiculoDAO.listar();
        }catch(Exception e ){
            System.out.println(e);
        
        }
        request.setAttribute("veiculo", v);
          RequestDispatcher dispatcher = request.getRequestDispatcher("/Pages/ProcurarVeiculo.jsp");
        dispatcher.forward(request, response);
        
    }

}
