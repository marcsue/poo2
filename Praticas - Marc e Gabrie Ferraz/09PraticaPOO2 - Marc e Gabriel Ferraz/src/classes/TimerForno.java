package classes;

public class TimerForno implements Comando{
	private Forno pn;
	
	public TimerForno (Forno pn)
	{
		this.pn = pn;
	}
	
	public void executar()
	{
		pn.setTimer(pn.timer);
	}

}
