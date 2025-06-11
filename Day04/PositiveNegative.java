class PositiveNegative{
	
	public static void main(String[] args){
		
		int [] a= {-1,4,-5,-8,9};
		
		for(int pos:a){
			if(pos>=0){
				System.out.println(pos);
			}
		}
		
		for(int neg:a){
			if(neg<0){
				System.out.println(neg);
			}
		}
	}
}