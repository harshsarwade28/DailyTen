import java.util.*;
class FactorialOfNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUmber");
		int no = sc.nextInt();
		
		int fact = 1;
		if(fact < 0){
			System.out.println("Cant Do");
		} else{
			
			for(int i=1; i<=no; i++)
			{
				fact = fact * i;
			}
			System.out.println("Factorial of "+no+" is "+fact);
		}
	}
}