package classes;


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