package br.com.bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaSandro = new Conta(2,33333);
		contaSandro.getTitular().setNome("Sandro Oscar Bugmann");
		contaSandro.deposita(5000);
		System.out.println("Saldo é: " + contaSandro.getSaldo());
		
		contaSandro.saca(300);
		System.out.println("Saldo é: " + contaSandro.getSaldo());

		Conta contaCassio = new Conta(3, 9999);
		contaCassio.getTitular().setNome("Cassio Splitter");
		
		if (contaSandro.transfere(2500, contaCassio)) {
			System.out.println("Transferência executada com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
	}

}
