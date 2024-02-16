import java.util.Scanner;
import java.lang.Math;

public class Calculadora {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros: ");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		
		System.out.println("Escolha a opecao que desja usar: ");
		String menu = "+: Soma \n";
		menu += "-: Subtracao \n";
		menu += "*: Multiplicacao \n";
		menu += "/: Divisao \n";
		menu += "%: Resto da Divisao inteira \n";
		menu += "m: Quem e maior \n";
		
		System.out.println(menu);
		
		char op = teclado.next().charAt(0);
		
		switch (op){
			case '+':
				System.out.println("Soma: " + (n1 + n2) );
				break;
			case '-':
				System.out.println("Subtracao: " + (n1 - n2) );
				break;
			case '*':
				System.out.println("Multiplicacao: " + (n1 * n2) );
				break;
			case '/':
				System.out.println("Divisao: " + ((double)n1 / n2) );
				break;
			case '%':
				System.out.println("Resto da Divisao inteira : " + (n1 % n2) );
				break;
			case 'm':
				System.out.println("Quem e maior : " + (Math.max(n1, n2)));
				break;
			default:
				System.out.println("opcao invalida");
				break;
		}
	}
}