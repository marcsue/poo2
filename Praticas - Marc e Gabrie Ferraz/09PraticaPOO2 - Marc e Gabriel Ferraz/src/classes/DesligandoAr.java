package classes;

public class DesligandoAr implements Comando{
	private ArCondicionado ar;
	
	public DesligandoAr (ArCondicionado ar)
	{
		this.ar = ar;
	}
	
	public void executar()
	{
		ar.desligarArCondicionado();
	}

}
