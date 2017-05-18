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
public class Milho extends AdicionalDecorator{
    
    Sanduiche sanduiche;
    
    public Milho(Sanduiche sanduiche){
        this.sanduiche = sanduiche;
    }
    
    public String getDescricao(){
        return sanduiche.getDescricao() + ", Milho";
    }
    
    public float calcularPreco(){
        return (float) (1.00 + sanduiche.calcularPreco());
    }
}
