package classes;

public class HomeTheaterFacade {
	CD cd;
	Filme filme;
	
	public HomeTheaterFacade(CD cd, Filme filme) {
		this.cd = cd;
		this.filme = filme;
	}
	
	public void assistirFilme(Filme filme)
	{
		System.out.println("Vc ira assistir ao filme "+filme.getNome());
		System.out.println("chama ligar projeotor");
		System.out.println("chama ligar som");
		System.out.println("chama abaixar a luz ambiente\n");
	}
	
	public void pararFilme(Filme filme)
	{
		System.out.println("vc parou de asssitir o filme "+filme.getNome());
		System.out.println("chama desligar projeotor");
		System.out.println("chama desligar som");
		System.out.println("chama aumenta a luz ambiente\n");
	}
	
	public void ouvirCD(CD cd)
	{
		System.out.println("Vc ira ouvir o cd "+cd.getNome());
		System.out.println("chama ligar som");
		System.out.println("seta volume medio do som\n");
	}
	
	public void pararCD(CD cd)
	{
		System.out.println("Vc parou de  ouvir o cd "+cd.getNome());
		System.out.println("seta volume mudo do som");
		System.out.println("chama desliga som\n");
	}
	
	
	

}
