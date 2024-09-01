package entities;

public abstract class Publicacao implements ItemBiblioteca {
	
	protected String autor;
	protected String titulo;
	private boolean disponibilidade;

	public Publicacao(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
		this.disponibilidade = true;
	}

	@Override
	public void emprestar() {
		System.out.println("Emprestando");
		this.disponibilidade = false;
	};
	
	@Override
	public void devolver() {
		System.out.println("Devolvendo");
		this.disponibilidade = true;
	};
	
	@Override
	public boolean consultarDisponibilidade() {
		if(disponibilidade) {
			return true;
		} else {
			return false;
		}
	};

}
