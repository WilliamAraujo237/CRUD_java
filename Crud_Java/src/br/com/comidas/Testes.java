package br.com.comidas;

public class Testes {

	public static void main(String[] args) {
		
		//Testando cosntrutor e metodos GET
		comidas c = new comidas("estrogonof", 10.0, "Luciana", null ); 
		System.out.println(c.getCriador());
		System.out.println(c.getNome());
		System.out.println(c.getValor());
		System.out.println(c.getData());
	}

}
