import java.util.Locale;
	import java.util.Scanner;

	public class exercicioOnze {
		 
		
			public static void main (String []args ) {
				 Locale.setDefault(Locale.US);
				 Scanner sc = new Scanner(System.in);
		
				 double valor;
				 
				 								 
				
				 int codigo = sc.nextInt();
				 int quantidade = sc.nextInt();
				 
				 if(codigo == 1 ) {
					valor = quantidade * 4.00;
					 System.out.printf("total: %.2f%n" , valor);				 
				 }
				 else if(codigo == 2) {
					 valor = quantidade * 4.50;
					 System.out.printf("total: %.2f%n" , valor);
				 }
				 else if(codigo == 3) {
					 valor = quantidade * 5.00;
					 System.out.printf("total: %.2f%n" , valor);
				 }
				 
				 else if(codigo == 4) {
					 valor = quantidade * 2.00;
					 System.out.printf("total: %.2f%n" , valor);
				 }
				 
				 else if (codigo == 5) {
					 valor = quantidade * 1.50;
					 System.out.printf("total: %.2f%n" , valor);
				 }
				 else {
					 System.out.println("Este Codigo não existe");
				 }
				 
				 
				 sc.close();		 
}
}