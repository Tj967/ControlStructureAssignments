
public class WhileLoop {

	public static void main(String[] args) {
		int x=13331;
		int reversed=0;
		int num=x;
		
		while(num!=0) {
			int remainder=num%10;
			reversed=reversed * 10 + remainder;
			num=num/10;
			
		}
		
		if (reversed==x) {
			System.out.println(x+" is a palindrome");
		} else {
			System.out.println(x+" is not a palindrome");
		}

	}

}
