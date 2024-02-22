import java.util.Scanner;

public class AnoBissexto{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ESTE PROGRAMA VERIFICA SE UM ANO EH BISSEXTO!");
		System.out.println("Ano: ");
		int ano = teclado.nextInt();
		
		/*String resultado = " eh bissexto!";
		if(ano%4 != 0 || (ano%100 == 0 && ano%400 != 0)){
			resultado = "nao eh bissexto!";
		}
		System.out.println(ano + resultado);*/
		
		System.out.println(ano%4 != 0 || (ano%100 == 0 && ano%400 != 0) ?  " nao eh bissexto" : " eh bissexto");
	}
}