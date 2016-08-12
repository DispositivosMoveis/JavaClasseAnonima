package br.edu.principal;

import br.edu.pacoteUm.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa(){
			
			public String TipoPessoa(){
				novoMetodo();
				return "Esta é uma pessoa qualquer!!";
			}
			
			/**
			 * Este método não poderá ser usado externamente, não foi declarado na classe Pessoa.			
			 * Mas pode ser usado internamente na classe anonima.
			 * @return
			 */
			public void novoMetodo(){
				System.out.println("Método adicionado a classe Pessoa");
			}
			
		/**
		 * Deve-se usar ponto e virgula aqui, pois a definição da classe é uma instrução!!	
		 */
		};
		
		/**
		 * Observem que a definição do objeto pessoa (p)
		 * reimplementa o método definido originalmente na classe Pessoa 
		 * que está no pacote br.edu.pacoteUm.
		 * Vejam o resultado da execução da linha abaixo!!
		 */
		
		System.out.println(p.TipoPessoa());
		
	}

}
