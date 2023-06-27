package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Operações da classe Object para verificar se dois objetos são iguais.\n"
				+ "\tequals: lento, resposta 100%\n"
				+ "\thasCode: rápido, porém a resposta positivo não é 100% garantida.\n"
				+ "\tSe o hashCode de 2 objetos forem diferentes, então eles são diferentes.\n"
				+ "\tSe o hashCode de 2 objetos forem iguais, muito provavelmente esse objetos são iguais"
				+ "\tHashCode usado para comparar grandes massas de dados.\n"
				+ "\tPara dados com o mesmo conteúdo muito provavelmente será gerado um hashCode idêntico\n"
				+ "\tPara dados diferentes será gerado um hashCode diferentes.\n"
				+ "\tObjetos diferentes podem concidentimente (muito raro) gerar o mesmo hashCode.\n");		
		

		String x = "Rafael";
		String y = "Maria";
		String z = "Joãozinho";
		String x1 = "Rafael";

		System.out.println("\nThe same hashCode");
		System.out.println(x.hashCode()==x1.hashCode()); // true
		System.out.println(x.equals(x1)); // true
		System.out.println(x==x1); // apotantam para o mesmo endereço de memória
		System.out.println(x.hashCode()); 
		System.out.println(x1.hashCode()); // se tem o mesmo hashCode muito provavelmente são iguais
		
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
		System.out.println(c3 == c4); // false	== vai comparar as referências de memória e não o conteúdo

		System.out.println("-----Second------");
		System.out.println("Compilador trata a expressão literal de forma especial e considera igual");
		String s1 = "Rafael";
		String s2 = "Rafael";
		System.out.println(s1 == s2); //  true

		System.out.println("-----Third------");
		System.out.println("Instanciando uma String força a criação de um novo objeto da forma comum em local diferentes");
		String s3 = new String("Rafael");
		String s4 = new String("Rafael");
		System.out.println(s3 == s4); // false
	}

}
