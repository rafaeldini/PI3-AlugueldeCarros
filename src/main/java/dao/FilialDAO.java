/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConnectionBD;
import model.Filial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author nadso
 */
public class FilialDAO {
    public static void inserir(Filial filial) throws SQLException{
        //Monta a String de inserção de uma filial no BD,
        //utilizando os dados da filial passados como parâmetros
        String sql = "INSERT INTO Filial(cnpj, razao, uf, cidade, resp) VALUES (?,?,?,?,?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //statement para obtenção através da conexão, execução de
        //comandos SQL e fechamento
        PreparedStatement preparedStatement = null;
        try{
            //abre conexão com o banco
            connection = ConnectionBD.obterConexao();
            //cria statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, filial.getCnpj());
            preparedStatement.setString(2, filial.getRazao());
            preparedStatement.setString(3, filial.getUf());
            preparedStatement.setString(4, filial.getCidade());
            preparedStatement.setString(5, filial.getResponsavel());
            
            System.out.println(filial.getCnpj());
            System.out.println(filial.getRazao());
            System.out.println(filial.getUf());
            System.out.println(filial.getResponsavel());
            System.out.println(filial.getCidade());
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
