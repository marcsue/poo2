/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica03;

/**
 *
 * @author ammnd_000
 */
public class SanduicheVeg extends Sanduiche {
    
    public SanduicheVeg(){
        descricao = "Saunduiche Vegetariano";
    }
    
    public float calcularPreco(){
        return(float) 8.00;
    }
    
}
