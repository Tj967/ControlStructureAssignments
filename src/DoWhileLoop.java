
public class DoWhileLoop {

	public static void main(String[] args) {
		//start iterator at 2 because the first two numbers are defined out of the loop
		int j=2;
		int num1=0;
		int num2=1;
		int sum=0;
		//print first two as they are defined out of the loop
		System.out.println(num1+"\n"+num2);
		do {
			sum=num1+num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;	
			j++;
		}while(j<10);

	}

}
