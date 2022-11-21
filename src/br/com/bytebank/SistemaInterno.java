package br.com.bytebank;

public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel auditavel) {
		boolean autenticou = auditavel.autentica(senha);
		if (autenticou) {
			System.out.println("Pode etrar no sistema");
		} else
			System.out.println("Acesso não permitido");
	}

}
