package ejercicio;
import java.util.Scanner; //Primer pado
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner(System.in);
		double celsius;
		System.out.print("Introduce la temperatura en grados celsius ");
		celsius = teclado.nextDouble();
		System.out.print("Fahrenheit: " +(1.8*celsius + 32)+"F");
		System.out.print("Kelvin " +(celsius + 273.15)+ "K");
		
		
		
		
		
		teclado.close();
		
	}
}