package classes;

import classes.Servidor;

public class Cliente implements Observer
{
	public void atualizar(Subject s)
	{	
		 System.out.println("[INFO] O Valor foi alterado para:" + ((Servidor) s).getValorAcoes());
	}
}
