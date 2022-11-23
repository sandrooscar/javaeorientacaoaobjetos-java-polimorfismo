package br.com.bytebank;

public class TesteConta {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 112);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(111, 1300);
		cp.deposita(200.0);
		
		cc.transfere(10, cp);
		
	}

}
