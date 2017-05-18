package classes;

public class ContaPoupanca extends Conta
{
	public ContaPoupanca()
	{
		setMostrar(new RentabilidadeNormal(), new MensalidadeBaixa(), new MovimentacaoSimplificada(), new LimiteBloqueado());
		
	}
}

