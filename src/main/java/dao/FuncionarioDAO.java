/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Filial;
import model.Funcionario;
import servico.UserFuncionario;


/**
 *
 * @author Matheus
 */
public class FuncionarioDAO {
    
    public static void inserir(Funcionario funcionario, UserFuncionario user, Filial filial)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro

        String sql = "INSERT INTO funcionario (Filial,Nome,Sexo,DatNasc,CPF,Cargo,Deptmento,Celular,Email,Username,Senha,Ativo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
         

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

            preparedStatement.setString(1, filial.getCidade());
            preparedStatement.setString(2, funcionario.getNome());
            preparedStatement.setString(3, funcionario.getSexo());
            preparedStatement.setString(4, funcionario.getDatanascimento());
            preparedStatement.setString(5, funcionario.getCpf());
            preparedStatement.setString(6, funcionario.getCargo());
            preparedStatement.setString(7, funcionario.getDepartamento());  
            preparedStatement.setString(8, funcionario.getCelular());  
            preparedStatement.setString(9, funcionario.getEmail());
            preparedStatement.setString(10, user.getUser());
            preparedStatement.setString(11, user.getSenha());
            preparedStatement.setBoolean(12, true);

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
    
     public static Funcionario procurar(String nome)
            throws SQLException, Exception {
        //Compõe uma String de consulta que considera apenas o cliente
        //com o ID informado e que esteja ativo ("enabled" com "true")
        String sql = "SELECT * FROM Funcionario WHERE (nome=? AND Ativo=?)";

        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionBD.obterConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, nome);
            preparedStatement.setBoolean(2, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Verifica se há pelo menos um resultado
            if (result.next()) {
                //Cria uma instância de Cliente e popula com os valores do BD
                
                String filial = result.getString("Filial");
                String name = result.getString("Nome");
                String sexo = result.getString("Sexo");
                String datNasc = result.getString("DatNasc");
                String cpf = result.getString("CPF");
                String cargo = result.getString("Cargo"); 
                String depto = result.getString("Deptmento");
                String celular = result.getString("Celular");
                String email = result.getString("Email");
                String username = result.getString("Username");
                
               Funcionario funcionario = new Funcionario(cargo, depto, name, sexo, datNasc, cpf, celular, celular, email, true);
                

                //Retorna o resultado
                return funcionario;
            }
            
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

        //Se chegamos aqui, o "return" anterior não foi executado porque
        //a pesquisa não teve resultados
        //Neste caso, não há um elemento a retornar, então retornamos "null"
        return null;
    }
    
    
    
}
