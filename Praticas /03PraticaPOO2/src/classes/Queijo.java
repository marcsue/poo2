package classes;

public class Queijo extends AdicionalDecorator{
    
    Sanduiche sanduiche;
    
    public Queijo(Sanduiche sanduiche){
        this.sanduiche = sanduiche;
    }
    
    public String getDescricao(){
        return sanduiche.getDescricao() + ", Queijo";
    }
    
    public float calcularPreco(){
        return (float) (2.50 + sanduiche.calcularPreco());
    }
}
