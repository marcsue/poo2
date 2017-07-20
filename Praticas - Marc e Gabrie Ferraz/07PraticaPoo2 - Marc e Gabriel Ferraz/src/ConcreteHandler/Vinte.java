package ConcreteHandler;


import Handler.ATM;

public class Vinte extends ATM{
    Dez dez = new Dez();

    @Override
    public String handleRequest(int request) {
        int div = 0;
        if(request >= 20) {
            div = request / 20;
        }
        return div + " notas de R$ 20,00\n" + dez.handleRequest(request - (div*20));
    }
}
