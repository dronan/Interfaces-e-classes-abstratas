package br.com.caelum.fj11.abstratas;

public abstract class FuncionarioAbstrato {
	/*
	 * Essa Ž uma classe abstrata; ela n‹o pode ser instanciada diretamente
	 * deve sempre ser extendida por alguma outra classe, sendo a raiz, a classe inicial
	 * o exemplo classico Ž se perguntar de a classe que herda ela, Ž uma ponta ou a origem.
	 * exemplo classico Ž a funcionario, "todo diretor Ž um funcionario e n‹o todo funcionario
	 * Ž um diretor", portanto a primeira classe, abstrata, seria o funcionario e a classe que 
	 * extende ela, a diretor;
	 * Diretentemente da interface, n‹o sou obrigado a escrever os metodos que na classe abstrata
	 * ou classe pai esta declarado.
	 */
	
	public String variavel = "";
	
	String metodoNovo(){
		return this.variavel;
	}
	
}
