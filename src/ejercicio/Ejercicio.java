package ejercicio;
import java.util.Scanner; //Primer pado
public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); //Segundo paso
		String nombre;
		double radio;
		double lado;
		double ladoLargo;
		double ladoCorto;
		double altura;
		double base;
		System.out.println("Introduce tu nombre");
		nombre = teclado.next();
		System.out.println("Bienvenida "+nombre+". Vamos a realizar diferentes calculos.");
		System.out.println("*********************************************");
		System.out.println("CIRCULO");
		System.out.print("introduce el valor del radio ");
		radio = teclado.nextDouble();
		System.out.println("El area del circulo es "+ Math.PI*Math.pow(radio, 2.0)+ "m2");
		System.out.println("*********************************************");
		System.out.println("CUADRADO");
		System.out.print("introduce el valor del lado ");
		lado = teclado.nextDouble();
		System.out.println("El area del cuadrado es "+ lado*lado+ "m2");
		System.out.println("*********************************************");
		System.out.println("RECTANGULO");
		System.out.print("introduce el valor del lado mas largo ");
		ladoLargo = teclado.nextDouble();
		System.out.print("introduce el valor del lado mas corto ");
		ladoCorto = teclado.nextDouble();		
		System.out.println("El area del rectangulo es "+ ladoLargo*ladoCorto+ " m2");
		
		System.out.println("*********************************************");
		System.out.println("TRIANGULO");
		System.out.print("introduce el valor de la altura ");
		altura = teclado.nextDouble();
		System.out.print("introduce el valor de la base ");
		base = teclado.nextDouble();		
		System.out.print("El area del triangulo es "+ (base*altura)/2+ " m2");
		teclado.close();//Cuarto paso
	}

}
