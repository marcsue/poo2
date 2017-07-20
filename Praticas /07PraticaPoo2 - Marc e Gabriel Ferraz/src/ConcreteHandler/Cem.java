package ConcreteHandler;


import Handler.ATM;

public class Cem extends ATM{
    Cinquenta cinquenta = new Cinquenta();

    @Override
    public String handleRequest(int request) {
        int div = 0;
        if (request >= 100) {
            div = request / 100;
        }
        return div + " notas de R$ 100,00\n" + cinquenta.handleRequest(request - (div*100));
    }
}
