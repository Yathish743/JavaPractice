
public class javaTest {
	
	public static void main(String[] args) {
		
		String s ="Yathish";
		//String a ="his";
		String b= "df";
		if(s.contains(b)) {
			int x= s.indexOf(b, 0);
			System.out.println(x);
		}
		else
			System.out.println("Text not found");
		
		removeAlphaCharacters("yathish@#G");
		Palidrome();
	}
	
	public static void removeAlphaCharacters(String c) {
		String d = c.replaceAll("[^@!!#^##!*&(*&#!(#))!]", "");
		System.out.println(d);
	}
	
	public static void Palidrome() {
		
		String s="Rahul";
		String a=s.toUpperCase();
		String c="";
		for(int i=a.length()-1;i>=0;i--) {
			c = c+ a.charAt(i);
		}
		if(a.equals(c))
			System.out.println("Palidrome");
		else
			System.out.println("Not Palidrome");
	}
	
}
