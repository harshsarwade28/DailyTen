import java.util.*;
class CountDigits{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.printl"Enter a Number: ");
		int no = sc.nextInt();
		
		int cnt = 0;
		
		while(no > 0){
			
		no = no / 10;
		cnt++;
			
		}
		System.out.println("Count is: "+cnt);
	}
}