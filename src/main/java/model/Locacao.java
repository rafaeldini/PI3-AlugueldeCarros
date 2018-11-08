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
    private String formPag;
    private int clienteId;
    private int funcId;
    private int veiculoId;

    public Locacao(int clienteId, int funcId, int veiculoId, float valor, int parcelas, String formPag) {
        this.clienteId = clienteId;
        this.funcId = funcId;
        this.veiculoId = veiculoId;
        this.valor = valor;
        this.parcelas = parcelas;
        this.formPag = formPag;
    }

    public float getValor() {
        return valor;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getFuncId() {
        return funcId;
    }

    public void setFuncId(int funcId) {
        this.funcId = funcId;
    }

    public void setVeiculoId() {
        this.veiculoId = veiculoId;
    }

    public int getVeiculoId() {
        return veiculoId;
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
        return formPag;
    }

    public void setFormPag(String FormPag) {
        this.formPag = FormPag;
    }

}
