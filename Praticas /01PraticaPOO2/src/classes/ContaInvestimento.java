package classes;

public class ContaInvestimento extends Conta
{
	public ContaInvestimento()
	{
		setMostrar(new RentabilidadeNormal(), new MensalidadeBaixa(), new MovimentacaoCompleta(), new LimiteBloqueado());
		
	}
}

