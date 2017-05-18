package classes;

public class ContaSalario extends Conta
{
	public ContaSalario()
	{
		setMostrar(new RentabilidadeBaixa(), new MensalidadeBaixa(), new MovimentacaoSimplificada(), new LimiteBloqueado());
		
	}
}

