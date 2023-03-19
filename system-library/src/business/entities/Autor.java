package business.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
	
	List<ObraImpressa> listaObras = new ArrayList<>();
	
	public Autor() {}

	public Autor(String nome, String cpf, LocalDate idade, String endereco) {
		super(nome, cpf, idade, endereco);
	}

	public List<ObraImpressa> getListaObras() {
		return listaObras;
	}

}
