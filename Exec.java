import java.util.Scanner;


public class Exec {
	public static void main(String[] args){
		IterFibo fibo = new IterFibo();
		System.out.println("Podaj liczb� wywo�a� iteracyjnych metody Fibonacciego");
		Scanner pobierz = new Scanner(System.in);
		int pobrano = pobierz.nextInt();
		System.out.println("Wykonanie metod� iteracyjn�:");
		fibo.iterFibo(pobrano);
		System.out.println("Wykonanie metod� rekurencyjn�:");
		fibo.recuFibo(pobrano);
		pobierz.close();
	}
}
