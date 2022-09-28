import java.util.Arrays;
import java.util.Scanner;

public class Esercizio {

	public static void main(String[] args) {
		
		System.out.println( stringaPariDispari("fratmo") );
		System.out.println( annoBisestile(235));
		stampa(4);
		plays();
		counter();
		
	}
	
	static boolean stringaPariDispari(String stringa) {
		boolean res = true;
		
		if(stringa.length() %2 == 0) {
			return res;
		}else {
			return !res;
		}
	}
	
	static boolean annoBisestile(int anno) {
		boolean bisestile = true;
		
		if(anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0) {
			return bisestile;
		}else {
			return !bisestile;
		}
	}
	
	static void stampa(int numero) {
		
	switch(numero) {
	case 0:
		System.out.println("zero");
		break;
	case 1:
		System.out.println("uno");
		break;	
	case 2:
		System.out.println("due");
		break;
	case 3:
		System.out.println("tre");
		break;	
	default:
		System.out.println("Inserire un numero valido");
	}
	}
	
	static void plays() {
        String str = "";

        while (!str.equals(":p")) {
            @SuppressWarnings("resource")
			Scanner myObj = new Scanner(System.in);
            System.out.println("Scrivi qualcosa: ");

            String userName = myObj.nextLine();  // Read user input
            str = userName;
            String[] good = str.split("");

            System.out.println("Username is: " + Arrays.toString(good));  // Output user input

        }
    }
	
	static void counter() {
		Scanner myObj = new Scanner(System.in);
        System.out.println("Scrivi un numero: ");
        
        int numero = Integer.parseInt(myObj.nextLine());
        
        for(int i = numero; i >= 0; i-- ) {
        	System.out.println(i);
        }
        myObj.close();
	}
}
