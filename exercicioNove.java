import java.util.Locale;
import java.util.Scanner;

public class exercicioNove {
	public static void main (String []args ) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	
		 int a , b;
		 
		 System.out.println("Digite os numeros");
		 a = sc.nextInt();
		 b = sc.nextInt();
	
		 if(a % b == 0 || b % a == 0 )  {
			 System.out.println("São Multiplos ");
			 }
		 else {
			 System.out.println("não são multiplos ");
		 }
		 
	
	
		 
		 
		 
		 
		 
		 
		 
		 sc.close();
	}
	
	
}
