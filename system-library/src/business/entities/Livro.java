package business.entities;
import java.time.LocalDate;

public class Livro extends ObraImpressa {
	
    private String generoLiterario;

    public Livro() {}

	public Livro(String titulo, int quantidade, int numeroDePaginas, String idioma, LocalDate anoDePublicacao,
			String editora, String generoLiterario) {
		super(titulo, quantidade, numeroDePaginas, idioma, anoDePublicacao, editora);
		this.generoLiterario = generoLiterario;
	}

	public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

	@Override
	public String toString() {
		return "Livro [generoLiterario=" + generoLiterario + "]";
	}
    
    
}
