import java.util.*;
class PrimeNumberTillN{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no = sc.nextInt();
		
		for(int i=2; i<=no; i++){
			
			boolean isPrime = true;
			
			for(int j=2; j<=Math.sqrt(i); j++){
				
				if(i % j == 0){
				isPrime = false;
				break;
				}
			}
			
			if(isPrime){
				System.out.println(i+" ");
			}
		}
	}
}