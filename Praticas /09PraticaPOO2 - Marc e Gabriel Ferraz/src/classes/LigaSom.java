package classes;

public class LigaSom implements Comando{
	private Som pn;
	
	public LigaSom (Som pn)
	{
		this.pn = pn;
	}
	
	public void executar()
	{
		pn.ligarSom();
	}

}
