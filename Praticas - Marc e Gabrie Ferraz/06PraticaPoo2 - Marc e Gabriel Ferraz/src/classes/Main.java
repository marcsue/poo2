package classes;
//MARC SUE PIRES MORAES JUNIOR 11411BCC022
//Gabriel Augusto Ferraz Martins 11221bcc036
public class Main {

	public static void main(String[] args) 
	{
		
		CD cd = new CD("joao volume 1",45.0 , "joao");
		Filme filme = new Filme("joao o filme",120.0 , "joao");
		
		HomeTheaterFacade htf = new HomeTheaterFacade(cd, filme);
		
		htf.assistirFilme(filme);
		htf.pararFilme(filme);
		htf.ouvirCD(cd);
		htf.pararCD(cd);
	}

}
