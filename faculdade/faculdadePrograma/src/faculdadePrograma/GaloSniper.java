package faculdadePrograma;

import java.util.Scanner;

public class GaloSniper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "";
		int numero = 0;
		System.out.println("Digite nome: ");
		nome = sc.nextLine();
		System.out.println("Digite conta: ");
		numero = sc.nextInt();
		System.out.print("\nNome do Cliente: "+ nome + "\nNumero da conta: "+numero);
	}
}
