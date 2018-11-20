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
public class Filial {

    private String cnpj;
    private String razao;
    private String uf;
    private String cidade;
    private String responsavel;

    public Filial() {

    }

    public Filial(String cnpj, String razao, String uf, String cidade, String responsavel) {
        this.cnpj = cnpj;
        this.razao = razao;
        this.uf = uf;
        this.cidade = cidade;
        this.responsavel = responsavel;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public static Filial filiaisCadastradas(String filial) {

        Filial filialSP = new Filial("1", "Tades Ltda", "SP", "Sao Paulo", "Milla Trodel");
        Filial filialPB = new Filial("2", "Tades Ltda", "PB", "Campina Grande", "Aline Martis");
        Filial filialDF = new Filial("3", "Tades Ltda", "DF", "Brasilia", "Luan Cavalcante");
        Filial filialSC = new Filial("4", "Tades Ltda", "SC", "Joinville", "Kenji Hamada");


        if (filialSP.getCidade().contains(filial)) {

            return filialSP;
        }
        if (filialPB.getCidade().contains(filial)) {

            return filialPB;
        }
        if (filialDF.getCidade().contains(filial)) {

            return filialDF;
        }
        if (filialSC.getCidade().contains(filial)) {

            return filialSC;
        }

        return null;
    }

}
