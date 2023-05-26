package Pisyst;

public class String_3 {
	public static void main(String[] args)
	{
		String s1="hello";
		s1.substring(1,3);
		System.out.println(s1);
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb.substring(1,3));
		System.out.println(sb);
	}

}
