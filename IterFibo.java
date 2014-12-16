import java.math.BigInteger;
import java.util.ArrayList;


public class IterFibo {
	private ArrayList<BigInteger> elements = new ArrayList<BigInteger>();
	private int counter = 0;
	private int revCounter;
	long beginning;
	private ArrayList<BigInteger> elements2 = new ArrayList<BigInteger>();
	
	
	public void iterFibo(int n){
		long start = System.nanoTime();
		for(int i=0; i<=n; i++){
			if (i<2){ 
				elements.add(BigInteger.valueOf(i));}
			else{
				elements.add(elements.get(elements.size()-1).add(elements.get(elements.size()-2)));
			}
			System.out.println("Element "+i+" ma wartoœæ "+elements.get(elements.size()-1));
		}
		long end = System.nanoTime() - start;
		System.out.println("Czas potrzebny na wykonanie zadania: "+end);
	}
	
	public void recuFibo(int n){
		revCounter = n;
		if(counter==0){
			beginning = System.nanoTime();
		}
		while(counter<=n){
			if(counter<2){
				elements2.add(BigInteger.valueOf(0));
				elements2.add(BigInteger.valueOf(1));
				counter++;
			}
			else{
				elements2.add(elements2.get(elements2.size()-1).add(elements2.get(elements2.size()-2)));
				System.out.println("Element "+counter+" ma wartoœæ "+elements2.get(elements2.size()-1));
				counter++;
				recuFibo(n);
			}
		}
		revCounter--;
		if(revCounter==0){
			long end = System.nanoTime() - beginning;
			System.out.println("Czas potrzebny na wykonanie zadania: "+end);
		}
		
	}
}


