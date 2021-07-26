package refactor2;

import java.util.List;

public class GeradorDeNotaFiscal {

    private List<AcaoAposGerarNota> acaoAposGerarNotaList;
    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
        this.acaoAposGerarNotaList = acoes;
    }


    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for (AcaoAposGerarNota acao: acaoAposGerarNotaList) {
            acao.executa(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
