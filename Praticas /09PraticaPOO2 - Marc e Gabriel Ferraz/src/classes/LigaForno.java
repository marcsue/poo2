package classes;

public class LigaForno implements Comando{
	private Forno pn;
	
	public LigaForno (Forno pn)
	{
		this.pn = pn;
	}
	
	public void executar()
	{
		pn.ligarForno();
	}

}
