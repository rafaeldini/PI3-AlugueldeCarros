/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.VeiculoDAO;
import model.Veiculo;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author NadsonJR
 */
@WebServlet(name = "InserirCarro", urlPatterns = {"/InserirCarro"})
public class InserirVeiculo extends HttpServlet {



   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/CadastroVeiculo.jsp");
        dispatcher.forward(request, response);
    }

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String placa = request.getParameter("placa");
        String cor = request.getParameter("cor");
        String modelo = request.getParameter("modelo");
        String ano = request.getParameter("ano");
        String marca = request.getParameter("marca");
        String km = request.getParameter("km");
        String categoria = request.getParameter("categoria");
        boolean ativo = true;
        
        

        Veiculo v = new Veiculo(placa,cor,ano,marca,modelo,categoria,km,ativo);
        try {
           VeiculoDAO.inserir(v);
            
        } catch (Exception e) {

        }
        request.setAttribute("veiculo", v);


        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/Pages/CadastroVeiculo.jsp");
        dispatcher.forward(request, response);

    }

}