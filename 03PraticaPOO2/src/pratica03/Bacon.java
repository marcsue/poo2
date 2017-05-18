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
public class Bacon extends AdicionalDecorator{
    
    Sanduiche sanduiche;
    
    public Bacon(Sanduiche sanduiche){
        this.sanduiche = sanduiche;
    }
    
    public String getDescricao(){
        return sanduiche.getDescricao() + ", Bacon";
    }
    
    public float calcularPreco(){
        return (float) (3.00 + sanduiche.calcularPreco());
    }
}