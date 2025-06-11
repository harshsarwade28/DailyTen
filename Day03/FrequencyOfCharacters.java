import java.util.*;
class FrequencyOfCharacters{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String word = sc.nextLine().toLowerCase();
		
		for(char ch='a'; ch<='z'; ch++){
			
			int cnt=0;
			
			for(int i=0; i<word.length(); i++){
				
				if(ch == word.charAt(i)){
					cnt++;
				}
			}
			
			if(cnt != 0){
				System.out.println(ch+" "+cnt);
			}
		}
	}
}