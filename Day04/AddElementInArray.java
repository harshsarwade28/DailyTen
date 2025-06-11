class AddElementInArray{
	
	public static void main(String[] args){
		
		int a[] = {30, 20, 10, 20};
		
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		
		System.out.println(sum);
	}
}