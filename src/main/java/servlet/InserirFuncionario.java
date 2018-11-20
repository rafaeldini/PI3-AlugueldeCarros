/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import dao.FuncionarioDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Filial;
import model.Funcionario;
import servico.UserFuncionario;

/**
 *
 * @author nadso
 */
@WebServlet(name = "FormularioInserirFuncionario", urlPatterns = {"/inserirFuncionario"})
public class InserirFuncionario extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/Pages/cadastroFuncionario.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String datanascimento = request.getParameter("DatadeNascimento");
        String celular = request.getParameter("celular");
        String email = request.getParameter("email");
        String sexo = request.getParameter("selectSexo");             
        String departamento = request.getParameter("selectDepto");
        String cargo = request.getParameter("selectCargo");
        String filialSelected = request.getParameter("selectFilial");
              
        Filial filial = Filial.filiaisCadastradas(filialSelected);
               
        UserFuncionario user = new UserFuncionario(nome);
        user.cadastrarUser();
        
        Funcionario f = new Funcionario
        (cargo, departamento, nome, sexo, datanascimento, cpf, sexo, celular, email, true);
        f.setUsername(user.getUser());
        f.setHashSenha(user.getSenha());
        f.setFilial(filial.getCidade());
        
        try {
        
            FuncionarioDAO.inserir(f);
        
        }catch(Exception e){
            
            e.getLocalizedMessage();
            System.out.println(e);
        
        }
      
        request.setAttribute("func", f);
        request.setAttribute("user", user);
        request.setAttribute("filial", filial);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/Pages/resultadoFuncionario.jsp");
        dispatcher.forward(request, response);

    }
}