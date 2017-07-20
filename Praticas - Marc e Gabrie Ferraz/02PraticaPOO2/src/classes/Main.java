package classes;

public class Main {

	public static void main(String[] args) {
			
		Servidor servidor = new Servidor();
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		servidor.adicionarObservador(c1);
		servidor.adicionarObservador(c2);
		
		servidor.alteraValor("\nPetrobras: 20.54 \nVale: 30.01 \nOCX:47.59\n");
		
		servidor.alteraValor("\nPetrobras: 70.54 \nVale: 50.01 \nOCX:10\n");

	}

}
