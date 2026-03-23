import java.util.Locale;
import java.util.Scanner;

public class exercicioQuartoze {
	public static void main (String []args ) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);	
		 
		 double salario, salarioT;
		 salario = sc.nextDouble();
		 
		 if(salario <= 2000.00) {
			System.out.printf("isento");
		 }
		 else if (salario > 2000 & salario <= 3000) {
			salarioT = (salario - 2000 )* 0.08;
			 System.out.printf("imposto: %.2f%n" , salarioT);
		 }
		 else if(salario > 3000 & salario <= 4500) {
			salarioT = (salario - 3000) * 0.18 + 1000 * 0.08;
		 System.out.printf("imposto: %.2f%n" , salarioT);
		 }
		 else {
				salarioT = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
				System.out.printf("imposto : %.2f%n", salarioT);
			}

		 
		 
		 sc.close();
	
	}
}
