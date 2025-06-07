import java.util.*;
class FibonacyProgram{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		
		int no1 = 0;
		int no2 = 1;
		int no3 = 0;
		
		for(int i=0; i<=no; i++){
			
			System.out.println(no1);
			no3 = no1 + no2;
			no1 = no2;
			no2 = no3;
		}
	}
}