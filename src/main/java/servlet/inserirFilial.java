/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.FilialDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Filial;

/**
 *
 * @author nadso
 */
@WebServlet(name = "inserirFilial", urlPatterns = {"/inserirFilial"})
public class inserirFilial extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/CadastroFilial.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String cnpj = request.getParameter("cnpj");
        String razao = request.getParameter("razao");
        String uf = request.getParameter("UF");
        String cidade = request.getParameter("cidade");
        String resp = request.getParameter("resp");
        
        Filial filial = new Filial(cnpj, razao, uf, cidade, resp);
        System.out.println(filial.getCnpj());
        System.out.println(filial.getRazao());
        System.out.println(filial.getUf());
        System.out.println(filial.getResponsavel());
        System.out.println(filial.getCidade());
        try{
            FilialDAO.inserir(filial);
                   
        }catch(Exception e){
            e.getLocalizedMessage();
            System.out.println(e);
        }
        request.setAttribute("Filial", filial);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/Pages/ConfirmaçãoCadastroFilial.jsp");
        dispatcher.forward(request, response);
    }


}
