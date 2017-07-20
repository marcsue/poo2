package classes;

public class ArCondicionado {
	int temperatura;

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
		System.out.println("Temperatura alterada para "+temperatura+" graus");
	}
	
	
	public void ligarArCondicionado()
	{
		System.out.println("Ligando ar condicionado");
	}
	
	public void desligarArCondicionado()
	{
		System.out.println("Desligando ar condicionado");
	}

	

}
