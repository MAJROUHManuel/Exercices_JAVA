import java.util.Scanner;

public class Rectangle {
	
	public static double readInput(String choixCote) {
		//Cette méthode va permettre d'entrer une valeur de longueur ou de largeur du rectangle selon qu'on entre en argument "Largeur ?" ou "Longueur ?". 
		//Elle retourne un double qui correspond à la largeur/longueur entrée par l'utilisateur.
		  
		Scanner entree = new Scanner(System.in);
		double cote = 0;
		
		switch(choixCote) {
		case "Largeur ?":
			System.out.println("Entrez la largeur : ");
			cote = entree.nextDouble();
			break;
		case "Hauteur ?":
			System.out.println("Entrez la longueur : ");
			cote = entree.nextDouble();
			break;
		default:
			System.out.println("Choisissez entre la longueur et la largeur! ");
			break;
		}
		
		return cote;
		
	}
	
	public static boolean testInputs(double largeur, double longueur) {
		//Cette méthode teste si la longueur et la largeur du rectangle obtenues avec readInput(String choixCote) est strictement supérieure à 0.
		//Il est en effet impossible qu'un rectangle est un coté de longueur nulle ou négative. La méthode ne renvoie rien.
		
		if(largeur > 0 && longueur > 0) {
			return true;
		}
		else {
			return false;
			}
	}
	
	public static void calculate(double largeur, double longueur) {
		//Voici la méthode qui va calculer la surface ou le périmètre du rectangle avec en argument sa longueur et sa largeur.
		//L'utilisateur choisit au préalable s'il veut calculer la surface ou le périmètre. Elle ne renvoie rien.
		 
		Scanner choix = new Scanner(System.in);
		System.out.println("Surface ('s/S) ou périmètre ('p/P')? : ");
		String choixCalcul = choix.nextLine();
		
		switch(choixCalcul.toLowerCase()) {
		case "s":
			double surface = longueur * largeur;
			System.out.println("La surface est " + surface);
			break;
		case "p":
			double perimetre = (longueur + largeur) * 2;
			System.out.println("Le périmètre est " + perimetre);
			break;
		default:
			System.out.println("Veuillez saisir s, S, p ou P!");
			break;
		}
	}
	
	public static void displayError() {
		//La méthode affiche un message d'erreur si l'utilisateur a entré une valeur négative ou nulle à la longueur ou la largeur. Elle ne renvoie rien.
		
		System.out.println("Les variables largeur et longueur ne peuvent pas être de valeur négative ou nulle");
	}

	public static void main(String[] args) {
		 double width = readInput("Largeur ?");
		 double length = readInput("Hauteur ?");
		  
		  boolean inputsOk = testInputs(width, length);
		  if (inputsOk) {
		    calculate(width, length);
		  } else {
		    displayError();
		  }

	}

}
