import java.util.*;
class countVowelsAndConsonents{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = sc.next().toLowerCase();
		
		int vowel=0;
		int consonent=0;
		
		for(int i=0; i<word.length(); i++){
			
			char ch = word.charAt(i);
			
			if(Character.isLetter(ch)){
				
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
					vowel++;
				} else{
					consonent++;
				}
			}
		}
		System.out.println(vowel);
		System.out.println(consonent);
	}
}