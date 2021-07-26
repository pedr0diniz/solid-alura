package refactor3;

public class CalculadoraDePrecos {

    private TabelaDePreco tabelaDePreco;
    private Entrega entrega;

    public CalculadoraDePrecos(TabelaDePreco tabelaDePreco, Entrega entrega) {
        this.tabelaDePreco = tabelaDePreco;
        this.entrega = entrega;
    }

    public double calcula(Compra produto) {

        double desconto = tabelaDePreco.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
