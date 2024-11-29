package ejercicio;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner(System.in);
		double cantidad;
		double tipoInteres;
		double tiempo;
		System.out.print("cual es la cantidad? de €:");
		cantidad = teclado.nextDouble();
		System.out.print("cual es el tipo de interes: ");
		tipoInteres = teclado.nextDouble();
		System.out.print("cual es la cantidad? de dias:");
		tiempo = teclado.nextDouble();
		System.out.print("La cantidad de interes es " +(cantidad*tipoInteres*tiempo)/(360*100)+"%");
		
		
		
		
		
		teclado.close();
	}

}
