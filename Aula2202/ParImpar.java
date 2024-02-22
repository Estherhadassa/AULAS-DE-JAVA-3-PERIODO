import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		System.out.println("Este programa verifica se um numero e impar ou par");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int num = teclado.nextInt();
		
		/*
		if(num % 2 == 0) {
			System.out.println("par");
		}else{
			System.out.println("impar");
		}
		*/
		System.out.println(num %2 == 0 ? "par" : "impar");
	}
}