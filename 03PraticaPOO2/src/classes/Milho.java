package classes;


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
