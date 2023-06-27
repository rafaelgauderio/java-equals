package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Opera��es da classe Object para verificar se dois objetos s�o iguais.\n"
				+ "\tequals: lento, resposta 100%\n"
				+ "\thasCode: r�pido, por�m a resposta positivo n�o � 100% garantida.\n"
				+ "\tSe o hashCode de 2 objetos forem diferentes, ent�o eles s�o diferentes.\n"
				+ "\tSe o hashCode de 2 objetos forem iguais, muito provavelmente esse objetos s�o iguais"
				+ "\tHashCode usado para comparar grandes massas de dados.\n"
				+ "\tPara dados com o mesmo conte�do muito provavelmente ser� gerado um hashCode id�ntico\n"
				+ "\tPara dados diferentes ser� gerado um hashCode diferentes.\n"
				+ "\tObjetos diferentes podem concidentimente (muito raro) gerar o mesmo hashCode.\n");		
		

		String x = "Rafael";
		String y = "Maria";
		String z = "Jo�ozinho";
		String x1 = "Rafael";

		System.out.println("\nThe same hashCode");
		System.out.println(x.hashCode()==x1.hashCode()); // true
		System.out.println(x.equals(x1)); // true
		System.out.println(x==x1); // apotantam para o mesmo endere�o de mem�ria
		System.out.println(x.hashCode()); 
		System.out.println(x1.hashCode()); // se tem o mesmo hashCode muito provavelmente s�o iguais
		
		System.out.println("\nDifferent HashCodes");
		
		System.out.println(y.hashCode()==z.hashCode()); //false
		System.out.println(y.equals(z)); // false	
	
		
		System.out.println(" -----------First--------------");
		System.out.println("Tem que ter o nome e email iguais para ser considerado igual");
		Client c1 = new Client("rafael", "contato@rafaeldeluca.com");
		Client c2 = new Client("rafael", "contato@delucahigiene.com.br"); // mesmo nome, mas email diferente
		Client c3 = new Client("rafael", "rafael@gmail");
		Client c4 = new Client("rafael", "rafael@gmail");		
		
		System.out.println(c1.equals(c2)); // false		
		System.out.println(c3.equals(c4)); // true		// mesmo email e nome		
		System.out.println(c3 == c4); // false	== vai comparar as refer�ncias de mem�ria e n�o o conte�do

		System.out.println("-----Second------");
		System.out.println("Compilador trata a express�o literal de forma especial e considera igual");
		String s1 = "Rafael";
		String s2 = "Rafael";
		System.out.println(s1 == s2); //  true

		System.out.println("-----Third------");
		System.out.println("Instanciando uma String for�a a cria��o de um novo objeto da forma comum em local diferentes");
		String s3 = new String("Rafael");
		String s4 = new String("Rafael");
		System.out.println(s3 == s4); // false
	}

}
