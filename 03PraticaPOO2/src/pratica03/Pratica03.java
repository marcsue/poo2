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
public class Pratica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sanduiche sanduiche = new SanduicheFrango();
        sanduiche = new Queijo(sanduiche);
        sanduiche = new Bacon(sanduiche);
        sanduiche = new Milho(sanduiche);
        sanduiche = new Picles(sanduiche);
        
        System.out.println("Sanduiche: " + sanduiche.getDescricao());
        System.out.println("Total: R$ " + sanduiche.calcularPreco());
    }
    
}
