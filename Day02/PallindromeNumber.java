import java.util.*;
class PallindromeNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.printl"Enter a Number: ");
		int no = sc.nextInt();
		
		int sum = 0;
		int temp = no;
		
		while(no > 0){
			
			int rem = no % 10;
			sum = (sum*10) + rem;
			no = no / 10;
		}
		
		if(temp == sum){
			System.out.println("Pallindrome");
		} else{
			System.out.println("Not");
		}
	}
}