package practice01;

import java.util.Calendar;

public class Test 
{

	public static void main(String[] args) 
	{
		int age;
		int year = 1995;
		Calendar cal = Calendar.getInstance();
		System.out.println("현재년도 : "+cal.get(Calendar.YEAR));
		age = cal.get(Calendar.YEAR)-year;
		System.out.println("태어난 년도 : "+year);
		System.out.println("나이 : "+age);
		
	}

}
