class ReplaceElement{
	
	public static void main(String[] args){
		
		int a[] = {1, 0, 9, 0, 2, 1};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				a[i]=10;
			}
		}
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
}