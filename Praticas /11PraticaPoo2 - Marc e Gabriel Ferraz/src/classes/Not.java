package classes;

public class Not extends Operador
{

	public Not(ExpressaoLogica op1) 
	{
		super(op1);
		
	}

	public boolean operacao() {
		
		return  !getOp1().operacao();
	}
	

}
