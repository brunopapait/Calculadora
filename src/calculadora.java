
import java.util.Scanner;

//Author - Bruno Henrique Papait
//Araruna - PR 31/10/2019
//HAPPY HALLOWEEN ! 

public class calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um número");
		float n1 = scanner.nextFloat();
		System.out.println("Informe o segundo número");
		float n2 = scanner.nextFloat();
		float soma = n1 + n2;
		float sub = n1 - n2;
		float mult = n1 * n2;
		float div = n1 / n2;

		int opc;
		do {
			System.out.println("Informe o operador");
			System.out.println("1 --- SOMAR");
			System.out.println("2 --- SUBTRAIR");
			System.out.println("3 --- MULTIPLICAR");
			System.out.println("4 --- DIVIDIR");
			System.out.println("0 --- SAIR");
			opc = scanner.nextInt();

			if (opc == 1) {
				System.out.println(n1 + " + " + n2 + " = " + soma);
			} else if (opc == 2) {
				System.out.println(n1 + " - " + n2 + " = " + sub);
			} else if (opc == 3) {
				System.out.println(n1 + " * " + n2 + " = " + mult);
			} else if (opc == 4){
				if (n1 <= 0 || n2 < 0) {
					System.out.println ("Não existe divisão por zero !");
				}else {
					System.out.println(n1 + " / " + n2 + " = " + div);
				}
			}
		} while (opc == 0);

		System.out.println("... FIM !");
	}
}
