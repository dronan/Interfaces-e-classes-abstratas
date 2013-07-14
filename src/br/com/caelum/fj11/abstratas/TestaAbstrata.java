package br.com.caelum.fj11.abstratas;

public class TestaAbstrata {

	public static void main(String[] args) {
		
		FuncionarioAbstrato gerente = new Gerente();
		System.out.println(gerente.metodoNovo());

	}

}
