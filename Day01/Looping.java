import java.util.*;
class Looping{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last Digit");
		int no = sc.nextInt();
		
		for(int i=0; i<=no; i++){
			System.out.print(i+" ");
		}
		
	}
}