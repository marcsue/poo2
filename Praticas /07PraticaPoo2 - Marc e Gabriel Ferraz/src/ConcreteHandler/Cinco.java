package ConcreteHandler;


import Handler.ATM;

public class Cinco extends ATM{
    Dois dois = new Dois();

    @Override
    public String handleRequest(int request) {
        int div = 0;
        if(request >= 5) {
            div = request / 5;
        }
        return div + " notas de R$ 5,00\n" + dois.handleRequest(request - (div*20));
    }
}
