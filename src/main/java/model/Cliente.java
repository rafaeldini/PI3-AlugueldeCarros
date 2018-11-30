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
public class Cliente extends Pessoa {

    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String bairro;
    private String estado;
    private String numhab;
    private Integer ID;

    public int getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Cliente(String logradouro, String numero, String complemento, String cidade, String bairro, String estado, String numHab, String nome, String sexo, String datanascimento, String cpf, String telefone, String celular, String email, boolean ativo) {
        super(nome, sexo, datanascimento, cpf, telefone, celular, email, ativo);
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.numhab = numHab;
    }

    public Cliente() {

    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumHab() {
        return numhab;
    }

    public void setNumHab(String numHab) {
        this.numhab = numHab;
    }

}
