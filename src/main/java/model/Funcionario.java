
package model;

import java.util.List;
import servico.CargoFuncionario;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Matheus
 */
public class Funcionario extends Pessoa{

  
    @Override
    public void tipo(Pessoa funcionario) {
        
    }
    private List<CargoFuncionario> cargo;
    private String departamento;
    private String superior;
    private String salario;
    
    private String username;
    private String hashSenha;

    public Funcionario(String username, String nome, String senhaAberta, List<CargoFuncionario> cargo) {
        this.username = username;
        super.getNome();
        setSenha(senhaAberta);
        this.cargo = cargo;
    }

  
    public Funcionario(List<CargoFuncionario> cargo, String departamento, String superior, String salario, String username, String nome, String sexo, String datanascimento, String cpf, String rg, String estadocivil, String cep, String logradouro, String numero, String complemento, String cidade, String bairro, String estado, String telefone, String celular, String email, boolean ativo) {
        super(nome, sexo, datanascimento, cpf, rg, estadocivil, cep, logradouro, numero, complemento, cidade, bairro, estado, telefone, celular, email, ativo);
        this.cargo = cargo;
        this.departamento = departamento;
        this.superior = superior;
        this.salario = salario;
        this.username = username;
    }
 
 



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getHashSenha() {
        return hashSenha;
    }

    public void setHashSenha(String senha) {
        this.hashSenha = senha;
    }

    public void setSenha(String senhaAberta) {
        this.hashSenha = BCrypt.hashpw(senhaAberta, BCrypt.gensalt());
    }

    public List<CargoFuncionario> getCargo() {
        return cargo;
    }

    public void setCargo(List<CargoFuncionario> cargo) {
        this.cargo = cargo;
    }

    public boolean validarSenha(String senhaAberta) {
        return BCrypt.checkpw(senhaAberta, hashSenha);
    }

    public boolean verificarCargo(String nomeCargo) {
        for (CargoFuncionario c : cargo) {
            if (c.getNome().equals(nomeCargo)) {
                return true;
            }
        }
        return false;
    }

   

    

    
    
}
