package entities;

public class Livro extends Publicacao {
	
	private int numeroDePaginas;

	public Livro(String autor, String titulo, int numeroDePaginas) {
		super(autor, titulo);
		this.numeroDePaginas = numeroDePaginas;
	}
	
	public String toString() {
		return titulo + ", " + autor + " e " + numeroDePaginas + " páginas";
	}
}
