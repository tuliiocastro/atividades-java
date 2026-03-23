import java.util.Locale;
import java.util.Scanner;

public class exercicioSete {
	public static void main (String []args ) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	
		 int numero;
		 
		 System.out.println("Digite um Numero : ");	
		 numero = sc.nextInt();
		 
		 if(numero < 0) {
			 System.out.println("NEGATIVO");
			}
		 else {
			 System.out.println("NÃO NEGATIVO ");
		 }
					 
			 
		 
				sc.close();			
	}
}	 
	
		
		 
		 

	


