package classes;

public class TemperaturaAr implements Comando{
	private ArCondicionado ar;
	
	public TemperaturaAr (ArCondicionado ar)
	{
		this.ar = ar;
	}
	
	public void executar()
	{
		ar.setTemperatura(ar.temperatura);
	}

}
