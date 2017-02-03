package hw0131;

import java.util.ArrayList;
import java.util.Scanner;

public class dataStructure{
	public static void main(String[] args){
		ArrayList<String> Str_Arr=new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		int len=0;
		int index=0;
		for(int i=0;i<5;i++){
			String str = scanner.nextLine();
			Str_Arr.add(str);
			if(str.length()>len){
				len = str.length();
				index = i;
			}
		}
		System.out.println();
		System.out.println("Longest string : "+Str_Arr.get(index));
		
		scanner.close();
	}
}