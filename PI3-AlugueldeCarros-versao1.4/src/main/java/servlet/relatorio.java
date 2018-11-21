/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.LocacaoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author victo
 */
@WebServlet(name = "relatorio", urlPatterns = {"/telaRelatorio"})
public class relatorio extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession sessao = request.getSession();
         
          try {
              List<model.Locacao> listaLocacao = LocacaoDAO.listar();
              System.out.println(listaLocacao.size());
             request.setAttribute("listaLocacao", listaLocacao);
            sessao.setAttribute("listaLocacao" , listaLocacao);
        } catch (Exception e) {
            System.out.println(e);
        }
              
            RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/telaRelatorio.jsp");
        dispatcher.forward(request, response);
    }


 @Override
   protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
       HttpSession sessao = request.getSession();
         
          try {
              String data = request.getParameter("data");
              System.out.println(data);
              List<model.Locacao> listaLocacao = LocacaoDAO.listar();
              System.out.println(listaLocacao.size());
             request.setAttribute("listaLocacao", listaLocacao);
            sessao.setAttribute("listaLocacao" , listaLocacao);
        } catch (Exception e) {
            System.out.println(e+"erro ao buscar locação");
        }
        


        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/Pages/telaRelatorio.jsp");
        dispatcher.forward(request, response);

    }

}
