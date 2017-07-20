package classes;

public class ControleRemoto {
	private Comando slot;

	Comando[] comandosOn;
	Comando[] comandosOff;
	Comando[] comandosSet;
	
	public ControleRemoto() {
		comandosOn = new Comando[7];
		comandosOff = new Comando[7];
		comandosSet = new Comando[7];
		Comando semComando = new ComandoNenhum();
		
		for (int i=0; i<7;i++)
		{
			comandosOff [i] = semComando;
			comandosOn [i] = semComando;
			comandosSet [i] = semComando;
		}
	}
	
	public void pressionarBotaoOn(int slot) {
		comandosOn[slot].executar();
	}
	
	public void pressionarBotaoOff(int slot) {
		comandosOff[slot].executar();
	}
	
	public void pressionarBotaoSet(int slot) {
		comandosSet[slot].executar();
	}
	
	public void setCommand(int slot, Comando on, Comando off,Comando set) {
		comandosOn[slot] = on;
		comandosOff[slot] = off;
		comandosSet[slot] = set;
	}

}
