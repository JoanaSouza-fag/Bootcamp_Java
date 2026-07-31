package desafio;

import pagamento.Pagamento;

public class Caixa {

	private Pagamento pagamento;
	
	public void setPagamento (Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public void finalizarCompra (double valor) {
		pagamento.pagar(valor);
	}
}
