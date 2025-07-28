package Day3;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int[] arr1= {5,10,15,20,25};
		int [] arr2= {30,35,40,45,50};
		int l1=arr1.length;
		int l2=arr2.length;
		int arr3[]=new int[l1+l2] ;
		for(int i=0;i<l1;i++) 
			arr3[i]=arr1[i];
		for(int i=0;i<l2;i++) 
			arr3[l1+i]=arr2[i];
		
		
		System.out.println("Merged Array: " + Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println("Ascending order: "+Arrays.toString(arr3));
		
		}
		}


