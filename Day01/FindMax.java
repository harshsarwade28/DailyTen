import java.util.*;

class FindMax{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers...");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int no3 = sc.nextInt();
		
		if(no1 > no2  && no1 > no3){
			System.out.println(no1+" Is Greater");
		} else if(no2 > no1 && no2 > no3){
			System.out.println(no2+" Is Greater");
		} else{
			System.out.println(no3+" Is Greater");
		}
	}
}