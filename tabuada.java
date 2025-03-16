package workspace;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número que gostaria de saber a tabuada: ");
		int num = scanner.nextInt();
		
		int numtab2 = (num * 2);
		int numtab3 = (num * 3);
		int numtab4 = (num * 4);
		int numtab5 = (num * 5);
 		int numtab6 = (num * 6);
		int numtab7 = (num * 7);
		int numtab8 = (num * 8);
		int numtab9 = (num * 9);
		int numtab10 = (num * 10);
		
		System.out.println("A tabuada do número escolhido é: " + num +", " + numtab2 +", " + numtab3 +", " + numtab4 +", " + numtab5 +", " + numtab6 +", " + numtab7 +", " + numtab8 +", " + numtab9 +", " + numtab10);
		
		scanner.close();

	}

}
