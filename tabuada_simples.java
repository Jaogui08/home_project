package workspace;

import java.util.Scanner;

public class tabuada_simples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número para saber a tabuada: ");
		int num = scanner.nextInt();
		
		System.out.println("\nTabuada do " + num + ": ");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		scanner.close();

	}

}
