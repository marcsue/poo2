package padrao.adapter;

import java.util.Date;

//MARC SUE PIRES MORAES JUNIOR 11411BCC022
//Gabriel Augusto Ferraz Martins 11221bcc036

public class PadraoAdapter {
    public static void main(String[] args) {
        
        Account account = new Account(10);
        Date date = new Date();
        
        BalanceCalculator legado = new BalanceCalculatorA();
        BalanceResolver novo = new BalanceAdapter(legado);
        novo.balanceFor(account, date);
    }
    
}
