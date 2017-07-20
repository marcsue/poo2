package classes;

public class DesligaPanela implements Comando{
	private PanelaEletrica pn;
	
	public DesligaPanela (PanelaEletrica pn)
	{
		this.pn = pn;
	}
	
	public void executar()
	{
		pn.desligarPanela();
	}

}
