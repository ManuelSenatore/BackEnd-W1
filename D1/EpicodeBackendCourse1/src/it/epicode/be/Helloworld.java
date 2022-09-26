package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		int n = 5;
		int[] myArray = {
			1,2,3,4,5
		};
		int x = 50;
		int pos = 4;
	    myArray =inserisciInArray(myArray, x, n, pos);
	    
	    Scanner in = new Scanner(System.in);
		
		System.out.println("dammi nome:");
		String b = in.nextLine();
		
		System.out.println("dammi età:");
		int a = Integer.parseInt( in.nextLine() );
		
		System.out.println("dammi cognome:");
		String c = in.nextLine();
		
		
		in.close();

		System.out.println("This is my first Epicode Java Project!");
		System.out.println( moltiplica(22, 33) );
		System.out.println( concatena("fratm ", 8));
		System.out.println("\nArray con " + x + " inserito alla posizione " + pos + ":\n" + Arrays.toString(myArray));
		System.out.println("il tuo nome è " + b + " la tua età è: " + a + " e il tuo cognome è " + c );
		System.out.println(c + " " + a + " " + b);
		System.out.println( perimetro(12.6, 25.2)); 
		System.out.println(pariDispari(31));
		System.out.println(area(10.5, 33.5, 11.3));
		}

  		public static int moltiplica(int n1, int n2) {
  			return n1 * n2;
  		};
  		
  		public static String concatena(String a, int n1) {
  			return a + n1;
  		};
  		
  		public static int[] inserisciInArray(int[] myArray, int x,
  				                                int n, int pos) {
  			int i;
  			int newarr[] = new int[n + 1];
  			
  		  for (i = 0; i < n + 1; i++) {
              if (i < pos - 1)
                  newarr[i] = myArray[i];
              else if (i == pos - 1)
                  newarr[i] = x;
              else
                  newarr[i] = myArray[i - 1];
  		  }
  		  return newarr;
  			
  		};
  		
  		public static double perimetro(double lato1, double lato2 ) {
  			return ((lato1 + lato2) * 2);
  		};
  		
  		public static int pariDispari(int x) {
  			if(x %2 == 0) {
  				return 0;
  			} else {
  				return 1;
  			}
  		};
  		
  		public static double area(double a, double b, double c) {
  			double p = a + b + c;
  			return (Math.sqrt(p*(p - a)*(p - b)*(p - c)));
  		}

  		
}



