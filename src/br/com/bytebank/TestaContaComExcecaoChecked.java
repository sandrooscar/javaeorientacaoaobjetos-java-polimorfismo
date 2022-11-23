package br.com.bytebank;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		ContaFake c = new ContaFake();
		try {
			c.deposita();
		} catch (MyExceptionChecked e) {
			System.out.println("Trata checked...");
		}
	}

}
