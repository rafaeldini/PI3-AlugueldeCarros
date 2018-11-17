/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.List;
import model.Filial;

/**
 *
 * @author Matheus
 */
public class ServiceFilial {
    
    private List<Filial> filiaiscadastradas;
          
    
    public ServiceFilial(List<Filial> filiaiscadastradas) {
        this.filiaiscadastradas = filiaiscadastradas;
    }

    public List<Filial> getFiliaiscadastradas() {
        return filiaiscadastradas;
    }

    public void setFiliaiscadastradas(List<Filial> filiaiscadastradas) {
        this.filiaiscadastradas = filiaiscadastradas;
    }

   
    
        
       
    
}
