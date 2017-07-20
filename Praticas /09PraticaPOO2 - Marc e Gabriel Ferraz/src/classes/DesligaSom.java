package classes;

public class DesligaSom implements Comando{
	private Som pn;
	
	public DesligaSom (Som pn)
	{
		this.pn = pn;
	}
	
	public void executar()
	{
		pn.desligarSom();
	}

}
