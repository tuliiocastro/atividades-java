import java.util.Locale;
import java.util.Scanner;

public class exercicioDoze {
	public static void main (String []args ) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Digite o valor : ");
		 double n1 = sc.nextDouble();
		 
		 if (n1 <= 25.00 & n1 >= 0.25) {
			 System.out.println("intervalo (0,25) ");
		 }
		 else if (n1 > 25.00 & n1 <= 50.00) {
			 System.out.println("intervalo (25,50)");
		 }
		 else if(n1 > 50.00 & n1 <= 75.00) {
			 System.out.println("Intervalo (50,75)");
		 }
		 else if (n1 > 75.00 & n1 <= 100.00) {
			 System.out.println("intervalo (75,100)");
		 }
		 else {
			 System.out.println("Fora do Intervalo");
		 }
	
	sc.close();
	}

}
