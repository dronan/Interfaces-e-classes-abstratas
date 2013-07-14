package br.com.caelum.fj11.abstratas;

public abstract class FuncionarioAbstrato {
	/*
	 * Essa � uma classe abstrata; ela n�o pode ser instanciada diretamente
	 * deve sempre ser extendida por alguma outra classe, sendo a raiz, a classe inicial
	 * o exemplo classico � se perguntar de a classe que herda ela, � uma ponta ou a origem.
	 * exemplo classico � a funcionario, "todo diretor � um funcionario e n�o todo funcionario
	 * � um diretor", portanto a primeira classe, abstrata, seria o funcionario e a classe que 
	 * extende ela, a diretor;
	 * Diretentemente da interface, n�o sou obrigado a escrever os metodos que na classe abstrata
	 * ou classe pai esta declarado.
	 */
	
	public String variavel = "";
	
	String metodoNovo(){
		return this.variavel;
	}
	
}
