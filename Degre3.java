import java.util.Scanner;
import java.lang.Math;

public class Degre3 {

	public static void main(String[] args) {
		Scanner nombres = new Scanner(System.in);
		System.out.println("Entrez a (int): ");
		int a = nombres.nextInt();
		System.out.println("Entrez b (int): ");
		int b = nombres.nextInt();
		System.out.println("Entrez c (int): ");
		int c = nombres.nextInt();
		double g = (double)a + (double)b;  //conversion de a et de b en double pour ne pas perdre en précision avec Math.pow()
		System.out.println("Entrez x (double): ");
		double x = nombres.nextDouble();
		double polynome = (g/2) * Math.pow(x, 3) + Math.pow(g, 2) * Math.pow(x, 2) + a + b + c;
		System.out.println("La valeur du polynôme est : " + polynome);

	}

}
