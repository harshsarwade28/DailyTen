import java.util.*;
class FindDuplicates{
	
	public static void main(String[] args){
		
		int arr[] = {3, 6, 1, 1, 7};
		
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		
		for(int num : arr){
			if(!seen.add(num)){
				duplicate.add(num);
			}
		}
		
		if(duplicate.isEmpty()){
			System.out.println("Not Found");
		} else{
			System.out.println("Found "+duplicate);
		}
	}
}