package classes;

public class Main {
	public static void main (String[] args)
	{
		AbirContaTemplate poup = new Poupanca();
		AbirContaTemplate CF = new CorrenteFisica();
		AbirContaTemplate CJ = new CorrenteJuridica();
		
		poup.templateMethod();
		CF.templateMethod();
		CJ.templateMethod();
		
		poup.cadastrarPessoa();
		CF.cadastrarPessoa();
		CJ.cadastrarPessoa();
	}
	

}
