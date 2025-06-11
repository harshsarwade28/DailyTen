class ContainsValue{
	
	public static void main(String[] args){
		
		int a[] = {30, 70, 10, 20};
		int find = 70;
		
		boolean found=false;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==find){
				found = true;
				break;
			}
		}
		if(found){
			System.out.println("Found");
		} else{
			System.out.println("Not Found");
		}
	}
}