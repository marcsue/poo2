package classes;

public class Som {
	int volume;

	public void setVolume(int volume) {
		System.out.println("Setando volume em: "+volume);
		this.volume = volume;
	}

	public void ligarSom()
	{
		System.out.println("Ligando som");
	}
	
	public void desligarSom()
	{
		System.out.println("Desligando som");
	}

}
