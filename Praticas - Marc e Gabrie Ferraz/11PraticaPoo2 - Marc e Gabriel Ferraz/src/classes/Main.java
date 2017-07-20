package classes;
//MARC SUE PIRES MORAES JUNIOR 11411BCC022
//Gabriel Augusto Ferraz Martins 11221bcc036
public class Main {

	public static void main(String[] args) {
		
		ExpressaoLogica e = new And(new And(new Operando(true), new Xor(new 
				Operando(false), new Operando(true))), new Not(new Operando(false))); 
		
		ExpressaoLogica e1 = new Not(new Operando(true));
		
		System.out.println(e.operacao()+" "+e1.operacao());
			
			
	

	}

}
