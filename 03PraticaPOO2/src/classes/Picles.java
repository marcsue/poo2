package classes;


public class Picles extends AdicionalDecorator{
    
    Sanduiche sanduiche;
    
    public Picles(Sanduiche sanduiche){
        this.sanduiche = sanduiche;
    }
    
    public String getDescricao(){
        return sanduiche.getDescricao() + ", Picles";
    }
    
    public float calcularPreco(){
        return (float) (1.00 + sanduiche.calcularPreco());
    }
}
