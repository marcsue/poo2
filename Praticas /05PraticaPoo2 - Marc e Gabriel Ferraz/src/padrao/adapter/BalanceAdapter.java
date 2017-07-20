package padrao.adapter;

import java.util.Calendar;
import java.util.Date;

public class BalanceAdapter implements BalanceResolver {
    
    BalanceCalculator balanceLegado;
    
    public BalanceAdapter(BalanceCalculator b){
        this.balanceLegado = b;
    }
    
    private Calendar dateToCalendar(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;

	}
    
    public double balanceFor(Account account, Date date) {
        balanceLegado.calculateBalance(account.getNumero(), dateToCalendar(date));
        return 2.3;
    }
    
}
