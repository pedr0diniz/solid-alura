package refactor5;

public class ContaComum implements Conta{

    private OperacoesBancarias operacoesBancarias;
    public ContaComum() {
        this.operacoesBancarias = new OperacoesBancarias();
    }

    public void saca(double valor) {
        operacoesBancarias.saca(valor);
    }

    public void deposita(double valor) {
        this.operacoesBancarias.deposita(valor);
    }

    public void rende() {
        this.operacoesBancarias.rende(1.1);
    }

    public double getSaldo() {
        return operacoesBancarias.getSaldo();
    }
}