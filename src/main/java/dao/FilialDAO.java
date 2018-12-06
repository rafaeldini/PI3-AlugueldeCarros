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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
     public static List<Filial> listar()
            throws SQLException, Exception {
        //Monta a string de listagem de clientes no banco, considerando
        //apenas a coluna de ativação de clientes ("enabled")
        String sql = "SELECT * FROM filial";
        //Lista de clientes de resultado
        List<Filial> listaFilial = null;
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

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaFilial == null) {
                    listaFilial = new ArrayList<Filial>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD

                int id = result.getInt("id");
                String cnpj = result.getString("cnpj");
                String razao = result.getString("razao");
                String uf = result.getString("UF");
                String cidade = result.getString("cidade");
                String resp = result.getString("resp");
                
                Filial f = new Filial(cnpj, razao, uf, cidade, resp);

                //Adiciona a instância na lista
                listaFilial.add(f);
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
        //Retorna a lista de clientes do banco de dados
        return listaFilial;
    }
     public static List<Filial> listarPorCnpj(String cnpjBanco)
            throws SQLException, Exception {
        //Monta a string de listagem de clientes no banco, considerando
        //apenas a coluna de ativação de clientes ("enabled")
        String sql = "SELECT * FROM filial Where Cnpj="+"'"+cnpjBanco+"'";
        //Lista de clientes de resultado
        List<Filial> listaFilial = null;
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

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaFilial == null) {
                    listaFilial = new ArrayList<Filial>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD

                int id = result.getInt("id");
                String cnpj = result.getString("cnpj");
                String razao = result.getString("razao");
                String uf = result.getString("UF");
                String cidade = result.getString("cidade");
                String resp = result.getString("resp");
                
                Filial f = new Filial(cnpj, razao, uf, cidade, resp);

                //Adiciona a instância na lista
                listaFilial.add(f);
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
        //Retorna a lista de clientes do banco de dados
        return listaFilial;
    }
      public static Filial procurarCnpj(String CnpjFilial)
            throws SQLException, Exception {
        //Compõe uma String de consulta que considera apenas o cliente
        //com o ID informado e que esteja ativo ("enabled" com "true")
        String sql = "SELECT * FROM Filial WHERE Cnpj=?"; 
        //Conexão para abertura e fechamento
        Connection connection = null;
        System.out.println("alo"+CnpjFilial);
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
           preparedStatement.setString(1, CnpjFilial);
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Verifica se há pelo menos um resultado
            if (result.next()) {
                //Cria uma instância de Cliente e popula com os valores do BD
                
                
                String cnpj = result.getString("cnpj");
                String razao = result.getString("razao");
                String uf = result.getString("UF");
                String cidade = result.getString("cidade");
                String resp = result.getString("resp");
                

                Filial f = new Filial(cnpj, razao, uf, cidade, resp);

                

                //Retorna o resultado
                return f;
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
      public static void AlterarFilial(Filial f, String cnpjFilial) throws Exception {
        System.out.println("Iniciando processo de atualização de Filial...");
        
        //comando sql
        String sql = "update Filial set Cnpj=?,Razao=?,UF=?,Cidade=?,Resp=? WHERE CNPJ=?";
         //Conexão para abertura e fechamento
        Connection connection = null;
        System.out.println(f.toString());
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;  
           
        
        
        try {
             //abre conexão com banco de dados
            connection = ConnectionBD.obterConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement=connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            //Comando do banco
            
            preparedStatement.setString(1, f.getCnpj());
            preparedStatement.setString(2, f.getRazao());
            preparedStatement.setString(3, f.getUf());
            preparedStatement.setString(4, f.getCidade());
            preparedStatement.setString(5, f.getResponsavel());
            
            System.out.println("numeroAlterado:"+f.getCnpj());

            System.out.println("cpf: " + f.getResponsavel());

            preparedStatement.executeUpdate();
        }catch(Exception e){
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
