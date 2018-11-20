/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Funcionario;
import servico.UserFuncionario;


/**
 *
 * @author Matheus
 */
public class FuncionarioDAO {
    
    public static void inserir(Funcionario funcionario, UserFuncionario user)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO funcionario (ID,idFilial,Nome,Sexo,DatNasc,CPF,Cargo,Deptmento,Celular,Email,Username,Senha,Ativo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionBD.obterConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setInt(1,1);
            preparedStatement.setInt(2,1);
            preparedStatement.setString(3, funcionario.getNome());
            preparedStatement.setString(4, funcionario.getSexo());
            preparedStatement.setString(5, funcionario.getDatanascimento());
            preparedStatement.setString(6, funcionario.getCpf());
            preparedStatement.setString(7, funcionario.getCargo());
            preparedStatement.setString(8, funcionario.getDepartamento());  
            preparedStatement.setString(9, funcionario.getCelular());  
            preparedStatement.setString(10, funcionario.getEmail());
            preparedStatement.setString(11, user.getUser());
            preparedStatement.setString(12, user.getSenha());
            preparedStatement.setBoolean(13, true);

            //Executa o comando no banco de dados
            preparedStatement.execute();
           
        }
        catch(Exception e){
        
            e.getLocalizedMessage();
            System.out.println(e);
        
        }
        
        finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
            
            
        }
    }
    
}
