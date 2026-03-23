
import java.util.Locale;
import java.util.Scanner;



public class exercicioCinco {
	
	public static void main (String []args ) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
				 int c1, c2 ;
				 double n1,n2,v1,v2, total;
				 
				 
				 c1 = sc.nextInt();				
				 n1 = sc.nextDouble();				 
				 v1 = sc.nextDouble();
				 c2 = sc.nextInt();
				 n2 = sc.nextDouble();								 
				 v2= sc.nextDouble();
				 total = (v1 * n1) + (v2 * n2);
				
				 
				 
				 System.out.printf("valor a pagar: %.2f%n " , total);
				 
				 
				 
		 sc.close();
	}
}
