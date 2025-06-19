import java.util.*;
class SwapNumbers{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int no1 = sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int no2 = sc.nextInt();
		
		no1 = no1 + no2;
		no2 = no1 - no2;
		no1 = no1 - no2;
		
		System.out.println("After Swap...");
		System.out.println("First Number: "+no1);
		System.out.println("Second Number: "+no2);
	}
}