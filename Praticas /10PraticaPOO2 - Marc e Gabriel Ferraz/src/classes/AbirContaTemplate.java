package classes;

public abstract class AbirContaTemplate 
{
	
	public final void templateMethod() {
		System.out.println("AbstractClass.templateMethod()"); 
	}
	public abstract void cadastrarPessoa();
	public abstract void validarPessoa();
	public abstract void depositarValorInicial();
	public abstract void cadastrarSenha();
	public abstract void finalizar ();
	
	public void configurarLimite (){};
	
	public void SE (){};
	
	public void solicitarCartaoCredito (){};
	
	
}
