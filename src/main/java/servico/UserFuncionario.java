/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import model.Funcionario;

/**
 *
 * @author Matheus
 */
public class UserFuncionario implements Serializable {
    

    private String nome;
    private String user;
    private String senha;
    
    public UserFuncionario() {
    }

    public UserFuncionario (String nome) {
        this.nome = nome;
 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
     private static final Map<String, Funcionario> USUARIOS_CADASTRADOS
            = new LinkedHashMap<>();

    static {
        USUARIOS_CADASTRADOS.put("batman", new Funcionario("Antonio Nadson", "pg"));             
        USUARIOS_CADASTRADOS.put("rafa", new Funcionario("Rafael Morais", "pg"));          
        USUARIOS_CADASTRADOS.put("raffa", new Funcionario("Raffael Wustemberg", "pg"));
        USUARIOS_CADASTRADOS.put("serafin", new Funcionario("Victor Serafin","pg"));
      
    }
    
    

    public Funcionario buscarPorUsername(String username) {
        return USUARIOS_CADASTRADOS.get(username);
    }
    
    public  void  cadastrarUser(){
        
      // Gera o nome de usuario apartir do nome informado... as iniciais do nome e sobrenome.
        user = nome.substring(0,1);
        char letra ;
        
        for (int i=0; i<nome.length(); i++) {

            letra = nome.charAt(i);
           
            if (letra  == ' '){
               letra = nome.charAt(i+1);
               user += Character.toString(letra);
            }
            
}
    senha = user;    
    USUARIOS_CADASTRADOS.put(user, new Funcionario(nome, senha));
    
    }


    
    

}

