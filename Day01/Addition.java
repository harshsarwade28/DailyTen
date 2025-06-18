import java.util.*;
class Addition{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		int no2 = sc.nextInt();
		
		int sum = no1+no2;
		System.out.println("Addition is "+sum);
	}
}