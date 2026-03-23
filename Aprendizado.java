import java.util.Locale;
import java.util.Scanner;

public class Aprendizado {
	 public static void main (String []args ) {
		Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 int x , y ,soma ;
		 
		 x = sc.nextInt();
		 sc.nextLine();
		 y = sc.nextInt();
		 soma = y + x ;
		 
		 System.out.println("Soma = " + soma );
		
		 
		 
		 sc.close();
	 }
}