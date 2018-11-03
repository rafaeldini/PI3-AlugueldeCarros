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
public class Locacao {
    
    private float valor;
    private int parcelas;
    private String FormPag;

    public Locacao(float valor, int parcelas, String FormPag) {
        this.valor = valor;
        this.parcelas = parcelas;
        this.FormPag = FormPag;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public String getFormPag() {
        return FormPag;
    }

    public void setFormPag(String FormPag) {
        this.FormPag = FormPag;
    }
    
    
}
