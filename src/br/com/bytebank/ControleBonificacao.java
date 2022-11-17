package br.com.bytebank;

public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario funcionario) {
		this.soma += funcionario.getBonificacao();
	}
	
	public double getSoma() {
		return this.soma;
	}
	
}
