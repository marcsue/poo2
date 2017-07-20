package classes;

public class CD {
	String nome;
	Double duracao;
	String autor;
	
	public CD(String nome, Double duracao, String autor) {
		this.nome = nome;
		this.duracao = duracao;
		this.autor = autor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getDuracao() {
		return duracao;
	}
	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
