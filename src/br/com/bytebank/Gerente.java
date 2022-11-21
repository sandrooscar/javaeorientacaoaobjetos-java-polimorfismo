package br.com.bytebank;

public class Gerente extends Funcionario implements Autenticavel{

	private int senha;

	@Override
	public double getBonificacao() {
		System.out.println("Bonificação do gerente...");
		return getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;	
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha)
			return true;
		return false;
	}	

}
