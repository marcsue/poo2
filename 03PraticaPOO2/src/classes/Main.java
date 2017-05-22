package classes;


public class Main {

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
