import java.util.HashMap;



public class Test1 {
	static String a ="Annapurna";
	public static void main(String[] args) {
		
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		for(int i =0; i<a.length();i++) {
			if(hm.containsKey(a.charAt(i))) {
				int c= hm.get(a.charAt(i));
				hm.put(a.charAt(i), ++c);
			}
			else
				hm.put(a.charAt(i), 1);
		}
		System.out.println(hm);
		Test1 obj = new Test1();
		obj.countOccurance(a);
	}
		
		
	public void countOccurance(String s) {
		String d = s.toLowerCase();
		char[] ch = d.toCharArray();
		int count =0;
		for(int i=0; i<s.length(); i++) {
			count = 0;
			for(int j=i+1; j< ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
				else
					count=1;
			}
			
			System.out.println(ch[i] +":"+ count);
		}
		
		
		
		
		
	}

}
