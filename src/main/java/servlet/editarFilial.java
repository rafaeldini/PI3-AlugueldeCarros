/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.ClienteDAO;
import dao.FilialDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Filial;

/**
 *
 * @author nadso
 */
@WebServlet(name = "editarFilial", urlPatterns = {"/editarFilial"})
public class editarFilial extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String Cnpj = (request.getParameter("Cnpj"));   
        Filial f = null; 
        try {
            System.out.println("teste");
            f = (Filial) FilialDAO.procurarCnpj(Cnpj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("Cnpj", Cnpj);
        request.setAttribute("Filial", f);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/editarFilial.jsp");
        dispatcher.forward(request, response);
    
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String cnpj = request.getParameter("cnpj");
                String razao = request.getParameter("razao");
                String uf = request.getParameter("uf");
                String cidade = request.getParameter("cidade");
                String resp = request.getParameter("resp");
                
                
                Filial f = new Filial(cnpj, razao, uf, cidade, resp);
                
        try {
            System.out.println("AlterarCliente POST");
            FilialDAO.AlterarFilial(f,cnpj);
        } catch (Exception e) {
        }
         RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/EditadoComSucesso.jsp");
        dispatcher.forward(request, response);
        }
    }

  


