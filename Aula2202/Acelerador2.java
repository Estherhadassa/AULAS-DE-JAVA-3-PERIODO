import java.util.Scanner;

public class Acelerador2{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int distancia = ler.nextInt();
		int sensor = (distancia-5)%8;
		
		System.out.println(sensor);
		
	}
}