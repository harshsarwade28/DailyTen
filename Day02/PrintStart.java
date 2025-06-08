import java.util.*;
class PrintStart{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How many line you want: ");
		int no = sc.nextInt();
		
		for(int i=1; i<=no; i++){
			
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}