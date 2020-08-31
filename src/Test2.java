import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		
		
		int[] i= {12, 334, 54, 76, 678};
		int m = i[0];
		for(int j=1; j<=i.length-1;j++) {
			if(i[j]<m) {
				m=i[j];
			}
		}
		System.out.println(m);
		secondLargestNumber(i);
		third(i);
	}
	
	public static void secondLargestNumber(int[] a) {
		int temp, size;
	      int array[] = {10, 87, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Third second largest number is:: "+array[size-2]);
	      for(int h=0;h<array.length;h++) {
	    	  System.out.println(array[h]);
	      }
		
		
	}
	
	public static void third(int[] s) {
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		System.out.println(s[s.length-2]);
		
		fourth(s);
	}
	
	public static void fourth(int[] f) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(43);
		a.add(54);
		a.add(67);
		a.add(23);
		Collections.sort(a);
		System.out.println(a);
		
		
		
	}
}
