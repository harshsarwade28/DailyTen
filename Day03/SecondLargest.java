class SecondLargest{
	
	public static void main(String[] args){
		
		int a[] = {60, 20, 50, 90, 10};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	
			System.out.println(a[1]);
	}
}