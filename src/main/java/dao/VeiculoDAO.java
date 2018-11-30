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
import java.util.ArrayList;
import java.util.List;
import model.Veiculo;

/**
 *
 * @author rafael.cdini1
 */
public class VeiculoDAO {

    public static void inserir(Veiculo veiculo)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO Veiculo (Placa, Cor, Ano, Marca, Modelo, Categoria, KM) VALUES (?,?,?,?,?,?,?)";
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

            preparedStatement.setString(1, veiculo.getPlaca());
            preparedStatement.setString(2, veiculo.getCor());
            preparedStatement.setString(3, veiculo.getAno());
            preparedStatement.setString(4, veiculo.getMarca());
            preparedStatement.setString(5, veiculo.getModelo());
            preparedStatement.setString(6, veiculo.getCategoria());
            preparedStatement.setString(7, veiculo.getKm());

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

    public static Veiculo procurar(String placaVeiculo)
            throws SQLException, Exception {
        //Compõe uma String de consulta que considera apenas o veiculo
        //com a placa informada
        String sql = "SELECT * FROM Veiculo WHERE Placa=?";

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
            preparedStatement.setString(1, placaVeiculo);
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Verifica se há pelo menos um resultado
            if (result.next()) {
                //Cria uma instância de Veiculo e popula com os valores do BD

                String placa = result.getString("Placa");
                String cor = result.getString("Cor");
                String ano = result.getString("Ano");
                String marca = result.getString("Marca");
                String modelo = result.getString("Modelo");
                String categoria = result.getString("Categoria");
                String km = result.getString("KM");

                Veiculo veiculo = new Veiculo(placa, cor, ano, marca, modelo, categoria, km);

                //Retorna o resultado
                return veiculo;
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

    public static List<Veiculo> listar()
            throws SQLException, Exception {
        //Monta a string de listagem de veiculo no banco
        String sql = "SELECT * FROM Veiculo";
        //Lista de clientes de resultado
        List<Veiculo> listaVeiculo = null;
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
                if (listaVeiculo == null) {
                    listaVeiculo = new ArrayList<Veiculo>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD

                String placa = result.getString("Placa");
                String cor = result.getString("Cor");
                String ano = result.getString("Ano");
                String marca = result.getString("Marca");
                String modelo = result.getString("Modelo");
                String categoria = result.getString("Categoria");
                String km = result.getString("KM");

                Veiculo veiculo = new Veiculo(placa, cor, ano, marca, modelo, categoria, km);
                //Adiciona a instância na lista
                listaVeiculo.add(veiculo);
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
        return listaVeiculo;
    }

    public static void atulizar(Veiculo veiculo) throws Exception {

        String sql = "UPDATE Veiculo SET Cor=?, Ano=?, Marca=?, Modelo=?, Categoria=?, KM=? WHERE Placa=?";

        Connection connection = null;

        PreparedStatement preparedStatement = null;

        
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionBD.obterConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"

         //   preparedStatement.setString(1, veiculo.getPlaca());
            preparedStatement.setString(1, veiculo.getCor());
            preparedStatement.setString(2, veiculo.getAno());
            preparedStatement.setString(3, veiculo.getMarca());
            preparedStatement.setString(4, veiculo.getModelo());
            preparedStatement.setString(5, veiculo.getCategoria());
            preparedStatement.setString(6, veiculo.getKm());
            preparedStatement.setString(7, veiculo.getPlaca());

            preparedStatement.executeUpdate();

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

    public static void deletar(String placa) throws Exception {

        String sql = "DELETE FROM Veiculo WHERE Placa=?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionBD.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, placa);
            preparedStatement.executeUpdate();

        } finally {

            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }

            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

}
