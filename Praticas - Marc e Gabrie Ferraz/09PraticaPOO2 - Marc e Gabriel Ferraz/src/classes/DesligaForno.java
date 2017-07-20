package classes;

public class DesligaForno implements Comando{
	private Forno pn;
	
	public DesligaForno (Forno pn)
	{
		this.pn = pn;
	}
	
	public void executar()
	{
		pn.desligarForno();
	}

}
