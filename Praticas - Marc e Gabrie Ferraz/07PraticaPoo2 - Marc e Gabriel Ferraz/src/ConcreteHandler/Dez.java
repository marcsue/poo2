package ConcreteHandler;


import Handler.ATM;

public class Dez extends ATM{
    Cinco cinco = new Cinco();

    @Override
    public String handleRequest(int request) {
        int div = 0;
        if(request >= 10) {
            div = request / 10;
        }
        return div + " notas de R$ 10,00\n" + cinco.handleRequest(request - (div*10));
    }
}
