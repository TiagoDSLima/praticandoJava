package entities;

public class Revista extends Publicacao{
	
	private int edicao;

	public Revista(String autor, String titulo, int edicao) {
		super(autor, titulo);
		this.edicao = edicao;
	}
	
	public String toString() {
		return titulo + ", " + autor + " e " + edicao + " páginas";
	}
}
