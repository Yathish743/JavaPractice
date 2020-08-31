import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		String str = "I am Studying Java to clear the Accolite Java code exam";
		String[] ar= str.split(" ");
		//System.out.println(ar);
		for(int i=0; i<ar.length; i++) {
			//System.out.println(ar[i]+ ":" + ar[i].length());
		if(ar[i].length() %2 ==0) {
			System.out.println(ar[i]);
		}
		
		}
		check(str);
		refer();
	}
	public static void check(String str) {
		
		String[] st = str.split(" ");
		String a ="";
		for(int i=st.length-1; i>=0; i--) {
			String d = st[i];
			a = a+" "+d;			
		}
		System.out.println(a);
	}
	
	public static void refer() {
		System.out.print("Enter a string: "); 
		Scanner in = new Scanner(System.in); 
		String inputStr = in.nextLine(); 
		String [] chars = inputStr.split(""); 
		String outputStr = ""; 
		for (int i = 0; i < chars.length; i++) { 
			if (i%2 == 0) { 
				outputStr = outputStr + chars[i].toUpperCase(); 
			} 
			else { 
				outputStr = outputStr + chars[i].toLowerCase(); 
			} 
		} 
		 
		System.out.println(outputStr); 
	}
}
