import java.util.*;
class CheckPrime{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=no; i++){
			
			if(no % i == 0){
				cnt++;
			}
		}
		
		if(cnt == 2){
			System.out.println(no+" Is Prime number");
		} else{
			System.out.println("Not Prime");
		}
	}
}