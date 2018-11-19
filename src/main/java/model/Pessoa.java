/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Matheus
 */
public abstract class Pessoa {
   
    private String nome;
    private String sexo;
    private String datanascimento;
    private String cpf;
    private String telefone;
    private String celular;
    private String email;
    private boolean ativo;

    public Pessoa(String nome, String sexo, String datanascimento, String cpf, String telefone, String celular, String email, boolean ativo) {
        this.nome = nome;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.ativo = ativo;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}