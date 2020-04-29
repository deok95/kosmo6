package practice01;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for(int i=0;i<=10;i++) {
				String[] str = br.readLine().split(" ");
				System.out.println(Integer.parseInt(str[0])+Integer.parseInt(str[1]));
			}
		} catch(NumberFormatException e) {e.printStackTrace();} 
		br.close();
	}
}
