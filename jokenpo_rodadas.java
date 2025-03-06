package workspace;

import java.util.Scanner;
import java.util.Random;

public class jokenpo_rodadas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] opcoes = {"Pedra", "Papel", "Tesoura"};
		int pontosusuario = 0;
		int pontosmaquina = 0;
		int rodadas = 5;
		
		System.out.println("Seja bem vindo ao jogo pedra, papel e tesoura!");
		System.out.println("O jogo terá " + rodadas + " rodadas e quem ganhar mais, vence!");
		
		for (int i = 1; i <= rodadas; i++) {
			System.out.println("\nRodada " + i + ": Escolha 0 - Pedra, 1 - Papel, 2 - Tesoura");
			int escolhausuario = scanner.nextInt();
			
			if (escolhausuario < 0 || escolhausuario > 2 ) {
				System.out.println("Escolha inválida!, Perda da rodada como punição");
				pontosmaquina++;
				continue;
			}
			
			int escolhamaquina = random.nextInt(3);
			
			System.out.println("Vc escolheu: " + opcoes[escolhausuario]);
			System.out.println("A máquina escolheu: " + opcoes[escolhamaquina]);
			
			if (escolhausuario == escolhamaquina) {
				System.out.println("Empate! ninguem recebe pontos");
			} else if ((escolhausuario == 0 && escolhamaquina == 2) ||
					   (escolhausuario == 1 && escolhamaquina == 0) ||
					   (escolhausuario == 2 && escolhamaquina == 1)) {
				System.out.println("Vc venceu essa rodada!");
				pontosusuario++;
			} else {
				System.out.println("A máquina venceu essa rodada!");
				pontosmaquina++;
			}
			
			System.out.println("Placar: Vc " + pontosusuario + " x " + pontosmaquina + " Máquina");
		}
		
		System.out.println("\n=== Fim do jogo! ===");
		if (pontosusuario > pontosmaquina) {
			System.out.println("Parabéns, vc ganhou com " + pontosusuario + " pontos!");
		} else if (pontosusuario < pontosmaquina) {
			System.out.println("A máquina venceu com " + pontosmaquina + " pontos!");
		} else {
			System.out.println("Empate! Os dois marcaram " + pontosusuario + " pontos!");
		}
		
		scanner.close();

	}

}
