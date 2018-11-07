/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;
import dao.ClienteDAO;
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

/**
 *
 * @author matheus.fboliveira
 */
@WebServlet(name = "ProcurarCliente", urlPatterns = {"/procurarCliente"})
public class ProcurarCliente extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
         
              
            RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/ProcurarCliente.jsp");
        dispatcher.forward(request, response);
    }


 @Override
   protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
       List<Cliente> listaClientes;
        HttpSession sessao = request.getSession();
        
        try {
            String nome = request.getParameter("nome");
           listaClientes =  (List<Cliente>) ClienteDAO.procurar(nome);
            if(nome == null || nome.equals("")){
                listaClientes = ClienteDAO.listar();
                request.setAttribute("listaClientes", listaClientes);
            }
            sessao.setAttribute("listClientes" , listaClientes);
            response.sendRedirect(request.getContextPath()+ "ProcurarCliente.jsp");
        } catch (Exception e) {

        }
        


        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/Pages/resultadoProcurar.jsp");
        dispatcher.forward(request, response);

    }
}