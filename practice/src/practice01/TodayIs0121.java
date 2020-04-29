package practice01;

public class TodayIs0121 
{

	public static void main(String[] args) 
	{
		StringBuffer buf = new StringBuffer();
		System.out.println("buf = "+buf);//""빈문자열이 저장되어있다
		System.out.println("buf = "+buf.toString());//toString()을 하여도 같은 결과값이다
		System.out.println("buf = "+buf.length());//빈 문자열이기에 총문자의 길이는 '0'이다
		System.out.println("기본 버퍼크기 ="+buf.capacity());//기본 버퍼의 크기는 16이다
		
		buf.append("JAVA");//append는 문자열에 괄호안의 문자를 첨부하는 메소드
		System.out.println("[JAVA문자열 저장후]");
		System.out.println("buf = "+buf);//"JAVA"가 붙여졌기때문에 JAVA가 문자열에 저장됨
		System.out.println("buf = "+buf.toString());
		System.out.println("buf = "+buf.length());//4글자 JAVA가 추가되어서 문자열의 길이는 4
		System.out.println("버퍼 크기 = "+buf.capacity());//버퍼의 크기는 여전히 4
		
		buf.append("0123456789").append("ABCD");//순차적으로 더해진다
		System.out.println("[추가적으로 문자열 저장후]");
		System.out.println("buf = "+buf);
		System.out.println("buf = "+buf.toString());
		System.out.println("buf = "+buf.length());
		System.out.println("버퍼 크기 = "+buf.capacity());//18글자의 문자열에 기본문자열 16이 더해저 34가된다
		
		buf.trimToSize();//비어있는 문자열의 수만큼 없애준다
		System.out.println("trimToSize()호출후 버퍼크기:"+buf.capacity());
		
		
		
		
		String string = "HELLO WORLD";
		System.out.println(reverse(string));
		
		

	}////main

	private static String reverse(String value) 
	{
		char[] src = value.toCharArray();
		char[] dest = new char[value.length()];
		for(int i=src.length-1;i>=0;i--)
		{
			dest[src.length-1-i]=src[i];
			
		}
		return String.valueOf(dest);
	}

	


}////class
