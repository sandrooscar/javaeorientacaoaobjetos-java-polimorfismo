package br.com.bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
        
		total++;
		System.out.println("O total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		System.out.println("Depositando " + valor + " na conta " + this.agencia + "/" + this.numero);
		this.saldo += valor;
	}

	public void saca(double valor) { 

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente! Saldo: " + this.saldo + ", valor: " + valor);
		}		
		
		System.out.println("Sacando " + valor + " na conta " + this.agencia + "/" + this.numero);
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta contaDestino) {
		this.saca(valor); 
		contaDestino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
}
