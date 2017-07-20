package classes;

public class And extends Operador
{

	public And(ExpressaoLogica op1, ExpressaoLogica op2) 
	{
		super(op1, op2);
		
	}

	public boolean operacao() {
		
		return  getOp1().operacao() && getOp2().operacao();
	}
	

}
