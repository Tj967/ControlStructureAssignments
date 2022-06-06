
public class ForLoopTest {

	public static void main(String[] args) {
		int i=5;
		int factorial=1;
		for(int j=1; j<=i; j++) {
			factorial=factorial*j;
		}
		System.out.println("Factorial of "+i+" is "+factorial);
	}

}
