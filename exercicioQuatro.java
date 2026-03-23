import java.util.Locale;
import java.util.Scanner;

public class exercicioQuatro {
	 public static void main (String []args ) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 int number;
		 double salario, horas , total;
		 
		 number = sc.nextInt();
		 sc.nextLine();
		 salario = sc.nextDouble();
		 sc.nextLine();
		 horas = sc.nextDouble();
		 sc.nextLine();
		 total = salario * horas ;	
		 System.out.println("Digite seu Numero: " + number);
		 System.out.println("digite seu salario: " + salario);
		 System.out.println("Digite suas horas trabalhadas: " + horas);
		 
		 System.out.println("Numero: " + number );
		 System.out.printf("Salario: US$ %.2f%n" , total);
		 
		 
		 sc.close();
		 
		

	 }
}