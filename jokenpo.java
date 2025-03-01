package workspace;

import java.util.Scanner;
import java.util.Random;

public class jokenpo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] opcoes = {"Pedra", "Papel", "Tesoura"};
		
		System.out.println("Escolha: 0 - Pedra, 1 - Papel, 2 - Tesoura");
		int escolhausuario = scanner.nextInt();
		
		if (escolhausuario < 0 || escolhausuario > 2) {
			System.out.println("Escolha inválida!");
		} else {
			int escolhamaquina = random.nextInt(3);
			
			System.out.println("Vc escolheu: " + opcoes[escolhausuario]);
			System.out.println("A máquina escolheu: " + opcoes[escolhamaquina]);
			
			if (escolhausuario == escolhamaquina) {
				System.out.println("Empate!");
			} else if ((escolhausuario == 0 && escolhamaquina == 2) ||
			           (escolhausuario == 1 && escolhamaquina == 0) ||
			           (escolhausuario == 2 && escolhamaquina == 1)) {
				System.out.println("Vc ganhou!");
			} else {
				System.out.println("Vc perdeu!");
			}
			
		}
		
		scanner.close();

	}

}
