package br.com.bytebank;

public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

	@Override
	public double getBonificacao() {
		System.out.println("Bonificação do gerente...");
		return super.getBonificacao() + super.getSalario();
	}
	
	

}
