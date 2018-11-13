
package model;

import java.util.List;
import servico.CargoFuncionario;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Matheus
 */
public class Funcionario extends Pessoa{

    private List<CargoFuncionario> cargo;
    private String departamento;
    private String username;
    private String hashSenha;

    public Funcionario(String username, String nome, String senhaAberta, List<CargoFuncionario> cargo) {
        this.username = username;
        super.getNome();
        setSenha(senhaAberta);
        this.cargo = cargo;
    }

    public Funcionario(List<CargoFuncionario> cargo, String departamento, String superior, String salario, String username, String hashSenha, String nome, String sexo, String datanascimento, String cpf, String telefone, String celular, String email, boolean ativo) {
        super(nome, sexo, datanascimento, cpf, telefone, celular, email, ativo);
        this.cargo = cargo;
        this.departamento = departamento;
        this.username = username;
        this.hashSenha = hashSenha;
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

    public List<CargoFuncionario> getP() {
        return cargo;
    }

    public void setPapeis(List<CargoFuncionario> papeis) {
        this.cargo = papeis;
    }

    public boolean validarSenha(String senhaAberta) {
        return BCrypt.checkpw(senhaAberta, hashSenha);
    }

    public boolean verificarPapel(String nomePapel) {
        for (CargoFuncionario c : cargo) {
            if (c.getNome().equals(nomePapel)) {
                return true;
            }
        }
        return false;
    }

   

    

    
    
}
