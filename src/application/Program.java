package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		/*
		 * • equals: lento, resposta 100% • hashCode: rápido, porém resposta positiva
		 * não é 100%
		 */

		String x = "Rafael";
		String y = "Maria";
		String z = "Joãozinho";
		String w = "Rafael";

		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());
		System.out.println(w.hashCode());
		System.out.println();
		System.out.println(x.equals(y));
		System.out.println(x.equals(w));

		/*
		 * Como x e w tem o mesmo hash code, muito provavelmente eles são iguai, isso
		 * pode ser confirmado com o médoto equal()
		 */
		System.out.println("-------------------------");

		Client c1 = new Client("rafael", "contato@rafaeldeluca.com");
		Client c2 = new Client("DeLuca", "contato@delucahigiene.com.br");
		Client c3 = new Client("rafael", "rafael@gmail");
		Client c4 = new Client("rafael","rafael@gmail");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c4));
		//== vai comparar as referências de memória e não o conteúdo
		System.out.println(c3==c4);
		
		System.out.println("-----------");
		//compilador trata a expressão literal de forma especial e considera igual
		String s1="Rafael";
		String s2="Rafael";		
		System.out.println(s1==s2);
		
		System.out.println("-----------");
		//Força a criação de um novo objeto da forma comum em local
		String s3=new String("Rafael");
		String s4=new String("Rafael");
		System.out.println(s3==s4);
		
			

	}

}
