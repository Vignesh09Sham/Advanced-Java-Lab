package com.mycompany.app;
import java.io.*;
import java.util.*;

public class PrintAscii{

	public String getAscii(String string){
		char c;
		String output = "";
		for(int i = 0; i < string.length(); i++){
			c = string.charAt(i);
			output = output + (int)c + " ";
			
		}
		return output;
	}

	// public static void main(String... args){
	// 	PrintAscii obj = new PrintAscii();
	// 	String ans = "";
	// 	ans = obj.getAscii("Sairam");
	// 	System.out.println(ans);
		
		
	// }
}