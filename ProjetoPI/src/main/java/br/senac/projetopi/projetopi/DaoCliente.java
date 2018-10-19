/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.projetopi.projetopi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class DaoCliente {

    private static Connection obterConexao()
            throws ClassNotFoundException, SQLException {
        Connection conn = null;

        // Passo 1: Registrar driver JDBC
        Class.forName("com.mysql.jdbc.Driver");
        // Passo 2: Obter a conexao
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/clientecrud",
                "root",
                "");
        return conn;
    }

    //Insere um cliente na tabela "cliente" do banco de dados
    public static void inserir(Cliente cliente)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO cliente (Nome, Sexo,DatNasc,CPF,RG,EstCivil,Cep,Logradouro,Numero,Complemento,Cidade,Bairro,Estado,Telefone,Celular,Email,Numhab,Ativo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = obterConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"

            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSexo());
            preparedStatement.setString(3, cliente.getDatanascimento());
            preparedStatement.setString(4, cliente.getCpf());
            preparedStatement.setString(5, cliente.getRg());
            preparedStatement.setString(6, cliente.getEstadocivil());
            preparedStatement.setString(7, cliente.getCep());
            preparedStatement.setString(8, cliente.getLogradouro());
            preparedStatement.setInt(9, Integer.parseInt(cliente.getNumero()));
            preparedStatement.setString(10, cliente.getComplemento());
            preparedStatement.setString(11, cliente.getCidade());
            preparedStatement.setString(12, cliente.getBairro());
            preparedStatement.setString(13, cliente.getEstado());
            preparedStatement.setString(14, cliente.getTelefone());
            preparedStatement.setString(15, cliente.getCelular());
            preparedStatement.setString(16, cliente.getEmail());
            preparedStatement.setString(17, cliente.getNumhab());
            preparedStatement.setBoolean(18, true);

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

    public static List<Cliente> listar()
            throws SQLException, Exception {
        //Monta a string de listagem de clientes no banco, considerando
        //apenas a coluna de ativação de clientes ("enabled")
        String sql = "SELECT * FROM Cliente";
        //Lista de clientes de resultado
        List<Cliente> listaClientes = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = obterConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaClientes == null) {
                    listaClientes = new ArrayList<Cliente>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD

                int id = result.getInt("id");
                String nome = result.getString("nome");
                String sexo = result.getString("sexo");
                String datanascimento = result.getString("datNasc");
                String cpf = result.getString("cpf");
                String rg = result.getString("rg");
                String estadocivil = result.getString("EstCivil");
                String cep = result.getString("cep");
                String logradouro = result.getString("logradouro");
                String numero = result.getString("numero");
                String complemento = result.getString("complemento");
                String cidade = result.getString("cidade"); 
                String bairro = result.getString("bairro");
                String estado = result.getString("estado");
                String telefone = result.getString("telefone");
                String celular = result.getString("celular");
                String email = result.getString("email");
                String numhab = result.getString("numhab");
                

                Cliente cliente = new Cliente(nome, sexo, datanascimento, cpf, rg, estadocivil, cep, logradouro, numero, complemento,
                        cidade, bairro, estado, telefone, celular, email, numhab);
                //Adiciona a instância na lista
                listaClientes.add(cliente);
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
        return listaClientes;
    }
}
