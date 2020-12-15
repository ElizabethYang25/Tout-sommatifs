/*
* Author : elizabethyang
*Date : 15-Dec-2020
*Description:
* Méthode qui permet de fair le somme des nombres premiers contenus dans un tableau de 100 
* nombres entiers générés au hasard.
*/
public class SommatifElizabethY
	{
			
		public static void main(String[] args)
			{

		        int [] monTab=new int[100];
		        System.out.println(calculerSomme(monTab));

		        for(int i=0;i<100;i++)
		                {
		                    monTab[i]=(int)(Math.random()*(i+1));
		                }
		            for (int element : monTab)
		                {
		                    char[] element_;
		                    System.out.println(element);
		                }

		            }

		        static int calculerSomme(int [] a)
		            {
		                    int somme=0;
		                    for(int i=0;i<a.length;i++)
		                        somme+=a[i]; //additionner les éléments
		                    System.out.println(somme);
		                    return somme;
		            }

		    }
