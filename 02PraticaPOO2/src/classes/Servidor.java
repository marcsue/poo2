package classes;
import java.util.*;

public class Servidor implements Subject
{
	private String valorAcoes;
	private ArrayList<Observer> observadores = new ArrayList <Observer>();
	
	public String getValorAcoes() {
		return valorAcoes;
	}

	public void setValorAcoes(String valorAcoes) {
		this.valorAcoes = valorAcoes;
	}
	
	public void alteraValor(String s)
	{
		setValorAcoes(s);
		notificarObservador();
	}

	public void notificarObservador()
	{
		for(Observer o:observadores)
			o.atualizar(this);
	}
	
	public void adicionarObservador(Observer o)
	{
		observadores.add(o);
	}
	

	
	
}
