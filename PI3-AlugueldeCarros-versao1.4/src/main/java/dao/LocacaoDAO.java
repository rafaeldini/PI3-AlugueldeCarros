/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Raffael
 */


import conexao.ConnectionBD;
import model.Locacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LocacaoDAO {
    
    public static void inserir(Locacao locacao)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO locacao (IdCliente, IdFunc,IdVeiculo,Valor,Parcelas,FormPag) VALUES (?,?,?,?,?,?)";
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

            preparedStatement.setInt(1, locacao.getClienteId());
            preparedStatement.setInt(2, locacao.getFuncId());
            preparedStatement.setInt(3, locacao.getVeiculoId());
            preparedStatement.setFloat(4, locacao.getValor());
            preparedStatement.setInt(5, locacao.getParcelas());
            preparedStatement.setString(6, locacao.getFormPag());


            //Executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
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
    
        public static List<Locacao> listar()
            throws SQLException, Exception {
        //Monta a string de listagem das locações no banco.
        String sql = "SELECT * FROM Locacao";
        //Lista de locações de resultado
        List<Locacao> listarLocacao = null;
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
                if (listarLocacao == null) {
                    listarLocacao = new ArrayList<Locacao>();
                }
                //Cria uma instância de Locacao e popula com os valores do BD

                
            
                
                
                
                int id = result.getInt("id");
                int clienteID = result.getInt("IdCliente");
                int funcId = result.getInt("IdFunc");
                int veiculoId = result.getInt("IdVeiculo");
                float valor = result.getFloat("Valor");
                int parcelas = result.getInt("Parcelas");
                String formPag = result.getString("FormPag");
                
                

               
                Locacao locacao = new Locacao(clienteID, funcId, veiculoId, valor, parcelas, formPag); //Adiciona a instância na lista
                listarLocacao.add(locacao);
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
        return listarLocacao;
    }
       
       
}
