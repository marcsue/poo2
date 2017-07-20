package classes;

public class Notas extends Caixa{

    int nota;
    
    public Notas (int nota) 
    {
        this.nota = nota;
    }
    
    @Override
    public void contaNotas(int valor) 
    {
        int atual = valor/nota;
        
        System.out.println(atual + " notas de " + nota);
        
        int resto = valor%nota;
        
        if (next != null)
            next.contaNotas(resto);
    }
    
}
