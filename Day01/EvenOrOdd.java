import java.util.*;
class EvenOrOdd{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUmber: ");
		int no = sc.nextInt();
		
		if(no % 2 == 0){
			System.out.println("Even...");
		} else{
			System.out.println("Odd...");
		}
	}
}