import java.util.*;
class SumOfDigits{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int no = sc.nextInt();
		int sum = 0;
		
		while(no > 0){
			
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
			
		}
		System.out.println("Sum is: "+sum);
	}
	
}