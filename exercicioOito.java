import java.util.Locale;
import java.util.Scanner;

public class exercicioOito {
	public static void main (String []args ) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	
		 int numero;
		 
		 System.out.println("Digite o Numero : ");
		 numero=sc.nextInt();
		 
		 if(numero % 2 == 0  ) {
			 System.out.println("PAR");
			 
		 }
		 else {
			 System.out.println("Impar");
		 }
		 
		 
		 
		 
		 
		 sc.close();
	}	
	
}
