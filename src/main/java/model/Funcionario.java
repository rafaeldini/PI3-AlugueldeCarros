
package model;

import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Matheus
 */
public class Funcionario extends Pessoa{
 
    private String filial;
    private String cargo;
    private String departamento;
    private String username;
    private String hashSenha;
    

    public Funcionario(String nome, String senhaAberta) {
        super.getNome();
        setSenha(senhaAberta);
        
    }

    public Funcionario(String cargo, String departamento, String nome, String sexo, String datanascimento, String cpf, String telefone, String celular, String email, boolean ativo) {
        super(nome, sexo, datanascimento, cpf, telefone, celular, email, ativo);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public Funcionario() {
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    

    public boolean validarSenha(String senhaAberta) {
        return BCrypt.checkpw(senhaAberta, hashSenha);
    }

        //    public boolean verificarCargo(String nomeCargo) {
        //        for (CargoFuncionario c : cargo) {
        //            if (c.getNome().equals(nomeCargo)) {
        //                return true;
        //            }
        //        }
        //        return false;
        //    }

   

    

    
    
}
