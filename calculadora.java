package workspace;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		double n1, n2, soma, sub, multi, div;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		n1 = scanner.nextDouble();
		
		System.out.print("Informe o segundo número: ");
		n2 = scanner.nextDouble();
		
		System.out.println("Informe a operação desejada: 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
		double operacao = scanner.nextDouble();
		
		soma = (n1 + n2);
		sub = (n1 - n2);
		multi = (n1 * n2);
		div = (n1 / n2);
		
		if (operacao <= 0 || operacao >= 5) {
			System.out.println("\nOperação selecionada inválida");
		} else if (operacao == 1) {
			System.out.println("\nO resultado da soma é: " + soma);
		} else if (operacao == 2) {
			System.out.println("\nO resultado da subtração é: " + sub);
		} else if (operacao == 3) {
			System.out.println("\nO resultado da multiplicação é: " + multi);
		} else if (operacao == 4) {
			System.out.println("\nO resultado da divisão é: " + div);
		}
		
		scanner.close();

	}

}
