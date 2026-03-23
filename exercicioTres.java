import java.util.Locale;
import java.util.Scanner;
public class exercicioTres {
	public static void main (String []args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a , b ,c ,d ;
		a = sc.nextInt();
		sc.nextLine();
		b = sc.nextInt();
		sc.nextLine();
		c = sc.nextInt();
		sc.nextLine();
		d = sc.nextInt();
		int diferenca =  (a * b - c * d);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("diferença: " + diferenca);
		
	
		
		
		sc.close();
	}

}
