package classes;

public abstract class Conta
{
	private Limite l;
	private Movimentacao mov;
	private Rentabilidade r;
	private Mensalidade me;
	
	public void setMostrar(Rentabilidade r, Mensalidade m,Movimentacao mov,Limite l)
	{
		this.l=l;
		this.mov=mov;
		this.me=m;
		this.r=r;	
	}
	
	
	public void mostrar()
	{
		r.mostrarRentabilidade();
		me.mostraMensalidade();
		mov.tipoMovimentacao();
		l.mostrarLimite();
	}
}