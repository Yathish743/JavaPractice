import java.util.HashMap;

public class Duplicate {

	public static void main(String[] args ) {
		String str = "exam code Java Accolite the clear to Java Studying am I clear";
		String[] a = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0; i<a.length;i++) {
			if(hm.containsKey(a[i])) {
				int c=hm.get(a[i]);
				hm.put(a[i], ++c);
				
			}
			else 
				hm.put(a[i], 1);
		}
		System.out.println(hm);
		prime();
	}
	
	public static void prime() {
		 int i,m=0,flag=0;      
		  int n=11;
		  m=n/2;  
		  System.out.println(m);
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  } 
		}    
		}
