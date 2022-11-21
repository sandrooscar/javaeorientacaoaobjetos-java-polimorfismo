package br.com.bytebank;

public interface Autenticavel {

	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
