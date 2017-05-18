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
public class Notas extends Caixa{

    int nota;
    
    public Notas (int nota) {
        this.nota = nota;
    }
    
    @Override
    public void contaNotas(int valor) {
        int atual = valor/nota;
        System.out.println(atual + " notas de " + nota);
        
        int resto = valor%nota;
        
        if (sucessor != null)
            sucessor.contaNotas(resto);
    }
    
}
