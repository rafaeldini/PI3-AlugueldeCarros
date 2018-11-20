/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import dao.VeiculoDAO;
import model.Veiculo;
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
@WebServlet(name = "ProcurarVeiculo", urlPatterns = {"/ProcurarVeiculo"})
public class ProcurarVeiculo extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
           RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/ProcurarVeiculo.jsp");
        dispatcher.forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            List<Veiculo> listaVeiculo;
        try{
            String placa = request.getParameter("placa");
//            listaVeiculo = VeiculoDAO.procurar(placa);
            if(placa == null){
            listaVeiculo = VeiculoDAO.listar();
             request.setAttribute("listaVeiculo", listaVeiculo);
            }
        }catch (Exception e){
           
        }
        RequestDispatcher destino = request.getRequestDispatcher("/Pages/ProcurarVeiculo.jsp");
        destino.forward(request, response);
    }





}