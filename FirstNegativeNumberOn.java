package dataStructures;

import java.util.LinkedList;

public class FirstNegativeNumberOn {
	 static void FirstNegative(int arr[], int k, int n) {
		LinkedList<Integer> ll = new LinkedList<>();
		int i;
		for(i = 0; i < k; i++) 
			if(arr[i] < 0)
				ll.add(i);
		
		
		for(; i < n; i++) {
			
			if(!ll.isEmpty()) 
				System.out.print(arr[ll.peek()] + " ");
			else
				System.out.print(0 + " ");
		
			while (!ll.isEmpty() && ll.peek() < (i-k+1)) 
		     ll.remove();	
			
			 if(arr[i]< 0)
				 ll.add(i);}
			
			if(!ll.isEmpty()) 
				System.out.print(arr[ll.peek()] + " ");
			
			else
				System.out.print(0 + " ");
			
		
		
	}
	public static void main(String args[]) {
		int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
		int k = 3;
		int n = arr.length;
		FirstNegative(arr,k,n);
	}
}
