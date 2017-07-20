package classes;

public class Forno {
	int timer;
	
	
	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		System.out.println("timer setado para "+timer +" minutros");
		this.timer = timer;
	}

	public void ligarForno()
	{
		System.out.println("Ligando forno");
	}
	
	public void desligarForno()
	{
		System.out.println("Desligando forno");
	}

	

}
