/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica04;

/**
 *
 * @author ammnd_000
 */
public class Pratica04 {
    public static void main(String[] args) {
       Caixa cx100 = new Notas(100);
       Caixa cx50 = new Notas(50);
       Caixa cx20 = new Notas(20);
       Caixa cx10 = new Notas(10);
       Caixa cx5 = new Notas(5);
       Caixa cx2 = new Notas(2);
       Caixa cx1 = new Notas(1);
       
       cx100.sucessor = cx50;
       cx50.sucessor = cx20;
       cx20.sucessor = cx10;
       cx10.sucessor = cx5;
       cx5.sucessor = cx2;
       cx2.sucessor = cx1;
       cx1.sucessor = null;
       
       cx100.contaNotas(475);
    }
    
}
