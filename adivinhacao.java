package workspace;

import java.util.Scanner;
import java.util.Random;

public class adivinhacao {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int numerosecreto = random.nextInt(20) + 1;
		int tentativa;
		
		System.out.println("Tente adivinhar um número entre 1 e 20!");
		
		do {
			System.out.println("Digite o seu palpite: ");
			tentativa = scanner.nextInt();
			
			if (tentativa < numerosecreto) {
				System.out.println("Muito baixo! Tente novamente");
			} else if (tentativa > numerosecreto) {
				System.out.println("Muito alto! Tente novamente");
			} else {
				System.out.println("Parabéns, vc acertou!");
			}
		} while (tentativa != numerosecreto);
		
		scanner.close();

	}

}
