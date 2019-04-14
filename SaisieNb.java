import java.util.Scanner;

public class SaisieNb {
	
	public static boolean estUnDecimal(String chaine) {
		//Cette méthode teste si la chaîne de caractère entrée contient un décimal et renvoie un booléen.
		
		try {
			Double.parseDouble(chaine);
		} 
		catch (NumberFormatException e){
			return false;
		}
 
		return true;
	}
	
	public static boolean estUnEntier(String chaine) {
		//Cette méthode teste si la chaîne de caractère entrée contient un entier et renvoie un booléen.
		
		try {
			Integer.parseInt(chaine);
		} 
		catch (NumberFormatException e){
			return false;
		}
 
		return true;
	}
	
	public static void main(String[] args) {
		//Il y a une erreur dans la méthode main: si l'utilisateur rentre autre chose qu'un entier, un message d'erreur s'affiche même s'il entre "exit".
		//Nous n'arrivons donc pas à sortir de la boucle while() et le programme demandera toujours d'entrer un nombre.
		
		Scanner sc = new Scanner(System.in);
		String nombre = " ";
		
		while(nombre != "exit") {
			System.out.println("Veuillez saisir un nombre ");
			nombre = sc.nextLine();
			if(estUnDecimal(nombre)) {
				if(estUnEntier(nombre)) {
					if(Integer.parseInt(nombre) > 0) {
						if(Integer.parseInt(nombre) % 2 == 0) {
							System.out.println("Le nombre saisi est positif et pair. ");
							//nombre = sc.nextLine();
						}
						else {
							System.out.println("Le nombre saisi est positif et impair. ");
							//nombre = sc.nextLine();
						}
					}
					else if(Integer.parseInt(nombre) < 0) {
						if(Integer.parseInt(nombre) % 2 == 0) {
							System.out.println("Le nombre saisi est négatif et pair. ");
							//nombre = sc.nextLine();
						}
						else {
							System.out.println("Le nombre saisi est négatif et impair. ");
							//nombre = sc.nextLine();
						}
					}
					else System.out.println("Le nombre saisi est zéro. Il est donc pair. ");
				}
			}
			else {
				System.out.println("Vous ne pouvez pas étudier un nombre décimal avec ce programme. Veuillez entrer un entier.");
			}
			
		}
				
		System.out.println("Fin du programme.");
	}
	
}							
