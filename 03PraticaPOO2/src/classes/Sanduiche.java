package classes;


public abstract class Sanduiche {
    String descricao;
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public abstract float calcularPreco();
}
