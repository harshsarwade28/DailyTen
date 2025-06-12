class CharacterCount{
	
	public static void main(String[] args){
		
		String s = "Hellow";
		s = s.toLowerCase();
		
		for(char ch = 'a'; ch<='z'; ch++){
			
			int cnt = 0;
			
			for(int i=0; i<s.length(); i++){
				
				if(ch == s.charAt(i)){
					cnt++;
				}
			}
			
			if(cnt != 0){
				System.out.println(cnt+" "+ch);
			}
		}
		
	}
}