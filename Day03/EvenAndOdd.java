class EvenAndOdd{
	
	public static void main(String[] args){
		
		int a[] = {30, 11, 55, 90, 33};
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i] % 2 == 0){
				System.out.println(a[i]+" Even Number");
			}
		}
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i] % 2 != 0){
				System.out.println(a[i]+" Odd Number");
			}
		}
		
	}
}