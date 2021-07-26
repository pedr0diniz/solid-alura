package refactor4;

import java.util.List;

public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {

        double total = 0;
        for(Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.adicionaPagamento(pagamento);

            //// errado pela Lei de Demeter, invocações encadeadas
//            fatura.getPagamentos().add(pagamento);

            //// precisa estar dentro da classe Fatura
//            total += boleto.getValor();
        }

        //// precisa estar dentro da classe Fatura
//        if(total >= fatura.getValor()) {
//            fatura.setPago(true);
//        }
    }
}
