package padrao.adapter;

import java.util.Calendar;

public class BalanceCalculatorA implements BalanceCalculator{

    public double calculateBalance(Integer account, Calendar date) {
        System.out.println("Metodo legado A.");
        return 3.4;
    }
    
}
