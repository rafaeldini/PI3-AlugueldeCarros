/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nadso
 */
public class Cliente extends Pessoa{
    
    private int numHab;

    public Cliente( String nome, String sexo, String datanascimento, String cpf, String rg, String estadocivil, String cep, String logradouro, String numero, String complemento, String cidade, String bairro, String estado, String telefone, String celular, String email, boolean ativo) {
        super( nome, sexo, datanascimento, cpf, rg, estadocivil, cep, logradouro, numero, complemento, cidade, bairro, estado, telefone, celular, email, ativo);
    }
    

    public Cliente(int numHab) {
        this.numHab = numHab;
    }

    

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }


    @Override
    public void tipo(Pessoa cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
    
}