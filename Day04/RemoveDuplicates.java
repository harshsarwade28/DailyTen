import java.util.*;
class RemoveDuplicates{
	
	public static void main(String[] args){
		
		int[] a={3, 5, 2, 2, 3, 5};
		
		Set<Integer> set = new LinkedHashSet<>();
		for(int arr : a){
			set.add(arr);
		}
		
		System.out.println(set);
	}
}