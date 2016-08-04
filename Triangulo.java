import java.util.Scanner;

class Triangulo {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		//Declaracao de variaveis
		int base;
		int altura;

		System.out.println("Digite a base do triangulo: ");
		base = entrada.nextInt();

		System.out.println("Digite a altura do triangulo: ");
		altura = entrada.nextInt();

		double area = (base * altura)/2.0;

		//System.out.println(area);
		System.out.printf( "%.1f\n", area );  
	}
	
}