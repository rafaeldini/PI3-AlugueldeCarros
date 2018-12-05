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
        
        String placa = request.getParameter("txtPlaca");
        String cor = request.getParameter("txtCor");
        String modelo = request.getParameter("txtModelo");
        String ano = request.getParameter("txtAno");
        String marca = request.getParameter("txtMarca");
        String categoria = request.getParameter("txtCategoria");
        String km = request.getParameter("txtKm");
        String valor = request.getParameter("txtValor");
        boolean ativo = true;
        
        

        Veiculo v = new Veiculo(placa,cor,ano,marca,modelo,categoria,km,valor,ativo);
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
