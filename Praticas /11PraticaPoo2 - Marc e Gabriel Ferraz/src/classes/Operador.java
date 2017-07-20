package classes;

public abstract class Operador implements ExpressaoLogica
{
	
	private ExpressaoLogica op1;
	private ExpressaoLogica op2;
	
	public Operador(ExpressaoLogica op1,ExpressaoLogica op2) 
	{
			this.op1 = op1;
			this.op2 = op2;
	}
	
	public Operador(ExpressaoLogica op1) 
	{
			this.op1 = op1;
	}
	 
	
	public ExpressaoLogica getOp1() {
		return op1;
	}

	public void setOp1(ExpressaoLogica op1) {
		this.op1 = op1;
	}

	public ExpressaoLogica getOp2() {
		return op2;
	}

	public void setOp2(ExpressaoLogica op2) {
		this.op2 = op2;
	}
}
