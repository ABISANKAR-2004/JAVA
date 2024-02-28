import java.lang.*;
import java.util.*;
import java.io.*;
class Day1{
	public static void main(String args[]){
		Scanner nu=new Scanner(System.in);
		String str,str2=" ";
		System.out.println("Enter yur string");
		str=nu.nextLine();
		int a=str.length();
		System.out.println("The lengthof the string:"+a);
		char ch;
		for(int i=0;i<a;i++){
			ch=str.charAt(i);
			str2=ch +str2;
		}
		System.out.println("The reversed  string:"+str2);
	}
}