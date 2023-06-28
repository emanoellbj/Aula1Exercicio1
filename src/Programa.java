import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		int num;
		System.out.println("Digite um numero: ");
		num = new Scanner(System.in).nextInt();

		int soma = 0;
		for (int i = 2; i <= num; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
			}
		}
		System.out.println("A soma dos numeros pares é: " + soma);
	}
}