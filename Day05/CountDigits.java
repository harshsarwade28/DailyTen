class CountDigits{
	
	public static void main(String[] args){
		
		int no = 1234;
		int cnt=0;
		
		while(no > 0){
			no = no /10;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}