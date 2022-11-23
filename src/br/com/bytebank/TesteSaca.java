package br.com.bytebank;

public class TesteSaca {

	public static void main(String[] args) {

		Conta c = new ContaCorrente(123, 321);
		c.deposita(200);
		c.saca(190);
		
		System.out.println("Saldo: "+c.getSaldo());
	}

}
