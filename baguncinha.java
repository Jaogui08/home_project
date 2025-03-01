package workspace;

import java.util.Scanner;

public class baguncinha {

	public static void main(String[] args) {
		String palavra;
		String palavrasistema = "avenged sevenfold";
		Scanner ler = new Scanner(System.in);

		System.out.println("vamos fazer um jogo, tente adivinhar a banda de heavy metal que estou pensando: ");
		palavra = ler.nextLine();

		if (palavra.equals(palavrasistema))
			System.out.println("parabéns vc acertou!");
		
		else System.out.println("vc errou! reinicie o programa e tente novamente");

	}

}
