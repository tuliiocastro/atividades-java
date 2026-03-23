import java.util.Locale;
import java.util.Scanner;


public class exercicioSeis {
	public static void main (String []args ) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 double A, B , C, pi;
		 double t1,c1,t2,q1,r1;
		 
		 pi = 3.14159;
		 A = sc.nextDouble();
		 B = sc.nextDouble();
		 C = sc.nextDouble();
		 
		 t1 = A * C / 2;
		 c1 = pi * Math.pow(C, 2.0);
		 t2 = (A + B) * C  /2 ;
		 q1 = Math. pow(B , 2.0);
		 r1 = A * B ;
		 System.out.printf("Triangulo : %.3f%n" , t1);
		 System.out.printf("Circulo : %.3f%n ", c1 );
		 System.out.printf("Trapezio : %.3f%n ", t2);
		 System.out.printf("Quadrado: %.3f%n ", q1);
		 System.out.printf("Retangulo: %.3f%n ", r1);
		 
		 
		 sc.close();
	}
}
