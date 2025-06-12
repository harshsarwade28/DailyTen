class SearchElement{
	
	public static void main(String[] args){
		
		 int arr[] = {1, 2, 3, 4, 5};
		 
		 int find = 5;
		 int cnt=0;
		 for(int i=0; i<arr.length; i++)
		 {
			if(arr[i]==find){
				cnt++;
				break;
			}
		 }
		 
		 if(cnt > 0){
			 System.out.println(" Found");
		 } else{
			 System.out.println(" Not Found");
		 }
	}
}