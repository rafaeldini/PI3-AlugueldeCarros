/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;
import dao.ClienteDAO;
import dao.FilialDAO;
import model.Cliente;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Filial;

/**
 *
 * @author matheus.fboliveira
 */
@WebServlet(name = "ProcurarFilial", urlPatterns = {"/procurarFilial"})
public class ProcurarFilial extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession sessao = request.getSession();
         
          try {
              List<Filial> listaFilial = FilialDAO.listar();
              System.out.println(listaFilial.get(0).getCnpj());
             request.setAttribute("listaFilial", listaFilial);
            sessao.setAttribute("listaFilial" , listaFilial);
        } catch (Exception e) {
            System.out.println(e);
        }
              
            RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/ProcurarFilial.jsp");
        dispatcher.forward(request, response);
    }


 @Override
   protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
       HttpSession sessao = request.getSession();
         
          try {
              String cnpj = request.getParameter("nome");
              System.out.println(cnpj);
              List<Filial> listaFilials = FilialDAO.listarPorCnpj(cnpj);
              System.out.println(listaFilials.size());
             request.setAttribute("listaFilial", listaFilials);
            sessao.setAttribute("listaFilial" , listaFilials);
        } catch (Exception e) {
            System.out.println(e+"erro ao buscar cliente");
        }
        


        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/Pages/ProcurarFilial.jsp");
        dispatcher.forward(request, response);

    }
}