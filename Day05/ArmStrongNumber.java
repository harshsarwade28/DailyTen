class ArmStrongNumber{
	
	public static void main(String[] args){
		
		int no = 152;
		
		int digits = String.valueOf(no).length();
		
		double sum = 0;
		int temp = no;
		
		while(no > 0){
			int rem = no % 10;
			sum = sum+Math.pow(rem, digits);
			no = no / 10;
		}
		
		if(temp == sum){
			System.out.println("Arm");
		} else{
			System.out.println("Not");
		}
	}
}