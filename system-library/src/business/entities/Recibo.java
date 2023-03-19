package business.entities;
import java.time.LocalDate;

public class Recibo {
	
    private LocalDate dataDeEmprestimo;
    private LocalDate dataDeEntrega;
    private LocalDate dataDeDevolucaoEfetiva;
    private Livro itemEmprestado;
    private Usuario usuarioQueRealizou;

    public Recibo(LocalDate dataDeEmprestimo, LocalDate dataDeEntrega, Livro itemEmprestado,
                      Usuario usuarioQueRealizou) {
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataDeEntrega = dataDeEntrega;
        this.itemEmprestado = itemEmprestado;
        this.usuarioQueRealizou = usuarioQueRealizou;
    }

    public LocalDate getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }

    public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public LocalDate getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(LocalDate dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    public LocalDate getDataDeDevolucaoEfetiva() {
        return dataDeDevolucaoEfetiva;
    }

    public void setDataDeDevolucaoEfetiva(LocalDate dataDeDevolucaoEfetiva) {
        this.dataDeDevolucaoEfetiva = dataDeDevolucaoEfetiva;
    }

    public Livro getItemEmprestado() {
        return itemEmprestado;
    }

    public void setItemEmprestado(Livro itemEmprestado) {
        this.itemEmprestado = itemEmprestado;
    }

    public Usuario getUsuarioQueRealizou() {
        return usuarioQueRealizou;
    }

    public void setUsuarioQueRealizou(Usuario usuarioQueRealizou) {
        this.usuarioQueRealizou = usuarioQueRealizou;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
            "dataDeEmprestimo=" + dataDeEmprestimo +
            ", dataDeEntrega=" + dataDeEntrega +
            ", dataDeDevolucaoEfetiva=" + dataDeDevolucaoEfetiva +
            ", itemEmprestado=" + itemEmprestado +
            ", usuarioQueRealizou=" + usuarioQueRealizou +
            '}';
    }
}


