package br.com.comidas;

public class Testes {

	public static void main(String[] args) {
		comidas c = new comidas("estrogonof", 10.0, "Luciana", null );
		
		System.out.println(c.getCriador());
		System.out.println(c.getname());
		System.out.println(c.getValor());
		System.out.println(c.getData());
	}

}
