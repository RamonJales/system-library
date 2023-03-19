package business.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArtigoCientifico extends ObraImpressa {
	
    private List<String> palavrasChave = new ArrayList<>();
    private List<String> referenciasBibliograficas = new ArrayList<>();

    public ArtigoCientifico() {}

	public ArtigoCientifico(String titulo, int quantidade, int numeroDePaginas, String idioma,
			LocalDate anoDePublicacao, String editora) {
		super(titulo, quantidade, numeroDePaginas, idioma, anoDePublicacao, editora);
	}

	public List<String> getPalavrasChave() {
		return palavrasChave;
	}

	public List<String> getReferenciasBibliograficas() {
		return referenciasBibliograficas;
	}
	
}

