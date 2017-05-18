package classes;

public class ContaCorrente extends Conta
{
	public ContaCorrente()
	{
		setMostrar(new RentabilidadeBaixa(), new MensalidadeNormal(), new MovimentacaoCompleta(), new LimiteLiberado());
		
	}
}

