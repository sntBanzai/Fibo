import java.util.Scanner;


public class Exec {
	public static void main(String[] args){
		IterFibo fibo = new IterFibo();
		System.out.println("Podaj liczbê wywo³añ iteracyjnych metody Fibonacciego");
		Scanner pobierz = new Scanner(System.in);
		int pobrano = pobierz.nextInt();
		System.out.println("Wykonanie metod¹ iteracyjn¹:");
		fibo.iterFibo(pobrano);
		System.out.println("Wykonanie metod¹ rekurencyjn¹:");
		fibo.recuFibo(pobrano);
		pobierz.close();
	}
}
