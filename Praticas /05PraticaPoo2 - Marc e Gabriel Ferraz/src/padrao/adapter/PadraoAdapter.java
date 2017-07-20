package padrao.adapter;

import java.util.Date;

public class PadraoAdapter {
    public static void main(String[] args) {
        
        Account account = new Account(10);
        Date date = new Date();
        
        BalanceCalculator legado = new BalanceCalculatorA();
        BalanceResolver novo = new BalanceAdapter(legado);
        novo.balanceFor(account, date);
    }
    
}
