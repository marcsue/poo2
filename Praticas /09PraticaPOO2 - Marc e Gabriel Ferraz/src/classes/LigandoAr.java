package classes;

public class LigandoAr implements Comando{
	private ArCondicionado ar;
	
	public LigandoAr (ArCondicionado ar)
	{
		this.ar = ar;
	}
	
	public void executar()
	{
		ar.ligarArCondicionado();
	}

}
