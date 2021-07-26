package refactor5;

public class ContaDeEstudante implements Conta{

    private OperacoesBancarias operacoesBancarias;
    private int milhas;

    public ContaDeEstudante() {
        this.operacoesBancarias = new OperacoesBancarias();
    }

    public void deposita(double valor) {
        operacoesBancarias.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }

}
