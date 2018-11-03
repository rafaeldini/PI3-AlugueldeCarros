/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import model.Funcionario;

/**
 *
 * @author Matheus
 */
public class CargoFuncionario implements Serializable {
    

    private String nome;

    public CargoFuncionario() {
    }

    public CargoFuncionario (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
      private static final Map<String, Funcionario> USUARIOS_CADASTRADOS
            = new LinkedHashMap<>();

    static {
        USUARIOS_CADASTRADOS.put("batman", new Funcionario("batman",
                "Antonio Nadson", "pg",
                Arrays.asList(new CargoFuncionario("VENDEDOR"))));
        USUARIOS_CADASTRADOS.put("rafa", new Funcionario("rafa",
                "Rafael Morais", "pg",
                Arrays.asList(new CargoFuncionario("GERENTE"))));
        USUARIOS_CADASTRADOS.put("raffa", new Funcionario("raffa",
                "Raffael Wustemberg", "pg",
                Arrays.asList(new CargoFuncionario("TI"), new CargoFuncionario("RETAGUARDA"))));
        USUARIOS_CADASTRADOS.put("serafin", new Funcionario("serafin",
                "Victor Serafin", "pg",
                Arrays.asList(new CargoFuncionario("ADMINISTRATIVO"), new CargoFuncionario("MARKETING"))));
    }

    public Funcionario buscarPorUsername(String username) {
        return USUARIOS_CADASTRADOS.get(username);
    }

}

