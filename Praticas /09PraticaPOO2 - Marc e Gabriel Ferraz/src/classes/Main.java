package classes;

public class Main {
	public static void main (String []args)
	{
		ArCondicionado ar = new ArCondicionado();
		Forno fn = new Forno();
		PanelaEletrica pe = new PanelaEletrica();
		Som som = new Som();
		
		ControleRemoto cr = new ControleRemoto();
		
		ar.temperatura = 22;
		fn.timer = 30;
		som.volume = 20;
		
		LigandoAr onAr = new LigandoAr(ar);
		DesligandoAr offAr = new DesligandoAr(ar);
		TemperaturaAr setAr = new TemperaturaAr(ar);
		
		cr.setCommand(0, onAr, offAr, setAr);
		
		cr.pressionarBotaoOn(0);
		cr.pressionarBotaoOff(0);
		cr.pressionarBotaoSet(0);
		
		
		
	}

}
