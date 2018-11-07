/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Funcionario;
import servico.CargoFuncionario;

/**
 *
 * @author NadsonJR
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("Pages/telaLogin.jsp");
        dispatcher.forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String senhaAberta = request.getParameter("senha");
       
        CargoFuncionario serviceFuncionario = new CargoFuncionario();
        Funcionario usuario = serviceFuncionario.buscarPorUsername(username);
        
        if(usuario!= null){
            boolean senhaValida = usuario.validarSenha(senhaAberta);
            if(senhaValida){
                //adicionar Usuario na sessão
                HttpSession sessao = request.getSession();
                sessao.setAttribute("usuario", usuario);
                response.sendRedirect(request.getContextPath()+ "/Home");
                return;
            }
        }
        //Reapresentar a tela de login
        request.setAttribute("msg", "Usuário ou senha Inválido! ");
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("Pages/telaLogin.jsp");
        dispatcher.forward(request, response);
    }
    }


//}
