import java.util.*;
class ReverseString{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String word = sc.nextLine().toLowerCase();
		String rev = "";
		
		for(int i=word.length()-1; i>=0; i--){
			
			rev = rev+word.charAt(i);
		}
		System.out.println(rev);
		
		if(word.equals(rev)){
			System.out.println("Pall");
		} else{
			System.out.println("Not");
		}
	}
}