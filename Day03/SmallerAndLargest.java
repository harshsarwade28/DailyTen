import java.util.*;
class SmallerAndLargest{
	
	public static void main(String[] args){

		
		int a[] = {50, 90, 20, 10};
		
		int min=a[0];
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min){
				min=a[i];
			} else if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}