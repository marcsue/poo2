package ConcreteHandler;

import handler.ATM;

public class Dois extends ATM {
    @Override
    public String handleRequest(int request) {
        int div = 0;
        if(request >= 20) {
            div = request / 20;
        }
        return div + " notas de R$ 2,00";
    }
}
