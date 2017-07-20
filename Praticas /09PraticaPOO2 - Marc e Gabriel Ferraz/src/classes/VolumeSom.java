package classes;

public class VolumeSom implements Comando{
	private Som pn;
	
	public VolumeSom (Som pn)
	{
		this.pn = pn;
	}
	
	public void executar()
	{
		pn.setVolume(pn.volume);
	}

}