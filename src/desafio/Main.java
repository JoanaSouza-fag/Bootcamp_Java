package desafio;

import pagamento.PagamentoPix;
import pagamento.PagamentoCartao;
import pagamento.PagamentoBoleto;

public class Main {

	public static void main(String[] args) {
		
		Caixa caixa = new Caixa();
		
		caixa.setPagamento(new PagamentoPix());
		caixa.finalizarCompra(150.00);
	
		caixa.setPagamento(new PagamentoCartao());
		caixa.finalizarCompra(200.00);
		
		caixa.setPagamento(new PagamentoBoleto());
		caixa.finalizarCompra(350.00);
	}
}
