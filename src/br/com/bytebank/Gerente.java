package br.com.bytebank;

public class Gerente extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		System.out.println("Bonificação do gerente...");
		return getSalario();
	}

	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);	
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}	

}
