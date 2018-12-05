/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.VeiculoDAO;
import java.io.IOException;
import java.util.List;
import model.Veiculo;

/**
 *
 * @author rafael.cdini1
 */
public class ServiceVeiculo {

    public class ServicoVeiculo {

        VeiculoDAO veiculoDAO = new VeiculoDAO();

        public void cadastrarVeiculo(Veiculo veiculo) throws IOException, Exception {

            try {
                veiculoDAO.inserir(veiculo);
            } catch (Exception e) {

            }
        }

        public List<Veiculo> procurarVeiculo() throws IOException, Exception {
            try {
                return veiculoDAO.listar();

            } catch (Exception e) {

                return null;
            }
        }

        public Veiculo obterVeiculo(String placaVeiculo, boolean ativo) throws IOException, Exception {
            try {
                return veiculoDAO.procurar(placaVeiculo, ativo);
            } catch (Exception e) {

                return null;
            }
        }

        public void excluirVeiculo(String placa) throws IOException, Exception {
            try {

                veiculoDAO.deletar(placa);
            } catch (Exception e) {

            }
        }

    }
}
