/*
* Author : elizabethyang
*Date : 15-Dec-2020
*Description des erreurs:
*1. Changer le nom du class
*2. Changer public string saluerAmi a public static string saluerAmi
*3. Enlever le point-virgule du ligne 20
*4. Ajouter un déclaration de retourn
*/
public class SommatifElizabethYang // changer le nom de la classe a SommatifElizabethYang au lieu de l'exemple. 
	{

		public static void main(String[] args)
			{
				System.out.println(saluerAmi("John"));

			}
		/*
		 * Méthode utiliser pour saluer un ami en utilisant son nom
		 */public static String saluerAmi(String nom) // enlever le point-virgule (;) et changer salurAmi a static
			 {
				
				 String message="Bonjour mon ami" + nom; // enlever le point-virgule (;) du ligne 20
				 return nom;
			 }
		 	
	}
