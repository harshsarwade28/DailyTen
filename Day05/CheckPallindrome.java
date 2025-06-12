class CheckPallindrome{
	
	public static void main(String[] args){
		
		int no = 1201;
		int temp = no;
		int sum =0;
		
		while(no > 0){
			int rem = no % 10;
			sum = (sum*10) + rem;
			no = no / 10;
		}
		
		if(temp == sum){
			System.out.println("Pallindrome Number");
		} else{
			System.out.println("Not Pallindrome");
		}
	}
}