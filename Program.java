import java.util.Locale;
import java.util.Scanner;
public class Program {
	

	 public static void main (String []args ) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 
		 double raio , area , pi;
		 pi = 3.14159;
		 raio = sc.nextDouble();
		 System.out.println("O valor do Raio é : " +  raio);
		 area = pi * Math.pow(raio, 2.0);
		 System.out.printf("O valor da aréa é : %.4f%n " , area );
		 
		
		 
		 
		
		 
		 
		 sc.close();
	 }	 
}	
