package business.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObraImpressa {
	
    private String titulo;
    private int quantidade;
    private int numeroDePaginas;
    private String idioma;
    private LocalDate anoDePublicacao;
    private String editora;
    private List<Autor> autores = new ArrayList<>();

    public ObraImpressa() {}
    
    public ObraImpressa(String titulo, int quantidade, int numeroDePaginas,
                        String idioma, LocalDate anoDePublicacao, String editora) {
        this.titulo = titulo;
        this.quantidade = quantidade;
        this.numeroDePaginas = numeroDePaginas;
        this.idioma = idioma;
        this.anoDePublicacao = anoDePublicacao;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public LocalDate getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(LocalDate anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	@Override
	public String toString() {
		return "ObraImpressa [titulo=" + titulo + ", quantidade=" + quantidade + ", numeroDePaginas=" + numeroDePaginas
				+ ", idioma=" + idioma + ", anoDePublicacao=" + anoDePublicacao + "]";
	}

    
}