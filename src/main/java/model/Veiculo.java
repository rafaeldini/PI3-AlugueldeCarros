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
public class Veiculo {
    
    private String placa;
    private String cor;
    private int ano;
    private String marca;
    private String modelo;
    private String categoria;
    private int km;
    private boolean ativo;

    public Veiculo(String placa, String cor, int ano, String marca, String modelo, String categoria, int km, boolean ativo) {
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.km = km;
        this.ativo = true;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
    
}
