package ConcreteHandler;


import Handler.ATM;

public class Cinquenta extends ATM{
    Vinte vinte = new Vinte();

    @Override
    public String handleRequest(int request) {
        int div = 0;
        if(request >= 50) {
            div = request / 50;
        }
        return div + " notas de R$ 50,00\n" + vinte.handleRequest(request - (div*50));
    }
}
