package classes;

public class LigaPanela implements Comando{
	private PanelaEletrica pn;
	
	public LigaPanela (PanelaEletrica pn)
	{
		this.pn = pn;
	}
	
	public void executar()
	{
		pn.ligarPanela();
	}

}
