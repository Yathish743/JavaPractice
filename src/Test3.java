import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		String a = "Yathish";
		String d= a.toLowerCase();
		String b="";
		for(int i=d.length()-1; i>=0;i--) {
			char c = d.charAt(i);
			b=b+c;			
		}
		if(d.equals(b))
			System.out.println("Palidrome");
		System.out.println("Not palidrome");
		System.out.println(b);
		
		swap();
		evenPlace();
		upperAndLower();
		LowerToUpper();
	}
	public static void evenPlace() {
		String a = "Yathish";
		String b= "";
		for(int i=1;i<=a.length()-1;i+=2) {
			char e= a.charAt(i);
			b=b+e;
		}
		System.out.println(b);
		
	}
	
	public static void swap() {
		String s = "Abcd";
		String a = "EFGH";
		s = s + a ;
		System.out.println(s);
		//a = s.substring(s.length() - a.length(), s.length());
		//s = s.substring(0, s.length() - a.length());
		a = s.substring(0, s.length() - a.length());
		s = s.substring(s.length() - a.length(), s.length());
		
		System.out.println(a);
		System.out.println(s);
		
	}
	public static void upperAndLower() {
		int i,len;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(Character.isUpperCase(ch))
                System.out.print(Character.toLowerCase(ch));
            else
                System.out.print(Character.toUpperCase(ch));
        }
    }
	public static void LowerToUpper() {
		int i,len;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("/n");
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(Character.isUpperCase(ch))
                System.out.print(Character.toLowerCase(ch));
            else
                System.out.print(Character.toUpperCase(ch));
        }
    }
		
	}
	
	

