import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		//Variables x et y indiquées par l'utilisateur
		Scanner permut = new Scanner(System.in);
		System.out.println("Entrez x : ");
		double x = permut.nextDouble();
		System.out.println("Entrez y : ");
		double y = permut.nextDouble();
		
		//Affichage avant permutation
		System.out.println("Avant permutation: ");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		//Permutation des valeurs de x et y par l'intermédiaire de deux autres variables du même type
		double v = y;
		double w = x;
		
		//Affichage après permutation
		System.out.println("Après permutation: ");
		System.out.println("x : " + v);
		System.out.println("y : " + w);

	}

}
