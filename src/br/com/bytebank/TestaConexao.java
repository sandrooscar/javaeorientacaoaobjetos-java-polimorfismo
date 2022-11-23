package br.com.bytebank;

public class TestaConexao {

	public static void main(String[] args) {

		try ( Conexao conexao = new Conexao() ) {
			conexao.leDados();
		} catch (IllegalStateException e) {
	        System.out.println("Deu erro na conexao");
		}
		
//	    try {
//	        Conexao con = new Conexao();
//	        con.leDados();
//	        con.fecha();
//	    } catch(IllegalStateException ex) {
//	        System.out.println("Deu erro na conexao");
//	    }
	}

}
