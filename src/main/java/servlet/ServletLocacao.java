/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.ClienteDAO;
import dao.VeiculoDAO;
import model.Cliente;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Veiculo;

/**
 *
 * @author nadso
 */
@WebServlet(name = "ServletLocacao", urlPatterns = {"/ServletLocacao"})
public class ServletLocacao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        Veiculo v = null;
        Cliente c = null;
        String placa = request.getParameter("Placa");
        String estado = request.getParameter("Ativo");
        boolean ativo = Boolean.parseBoolean(estado);
        String nome = request.getParameter("Nome");
         try{
                     
            List<Cliente> listaCliente = ClienteDAO.listar();
            List<Veiculo> listaVeiculo = VeiculoDAO.listar();
            request.setAttribute("listaCliente", listaCliente);
            request.setAttribute("listaVeiculo", listaVeiculo);
            
        }catch (Exception e){
            System.out.println(e);
        }
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/Locacao.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

      String nome = request.getParameter("nomeCliente");
      String cpf = request.getParameter("cpfCliente");

       try {

            ClienteDAO.procurar(nome);
            ClienteDAO.procurarCpf(cpf);

        } catch (Exception e) {

        }
       // request.setAttribute("cliente", c);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/Pages/Locacao.jsp");
      dispatcher.forward(request, response);

    }
}
