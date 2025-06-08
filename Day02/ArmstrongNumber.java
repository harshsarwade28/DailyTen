import java.util.*;
class ArmstrongNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no = sc.nextInt();
		
		int digits = String.valueOf(no).length();
		
		double sum = 0;
		int temp = no;
		
		while(no > 0){
			int rem = no % 10;
			sum = sum+Math.pow(rem, digits);
			no = no / 10;
		}
		
		if(temp == sum){
			System.out.println("Armstrong Number");
		} else{
			System.out.println("Not Armstrong Number");
		}
	}
}