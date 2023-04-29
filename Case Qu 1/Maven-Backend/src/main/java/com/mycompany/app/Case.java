package com.mycompany.app;
import java.io.*;
import java.util.*;

public class Case{
	public boolean checkUpper(char c){
		if((int)c >= 65 & (int)c <= 90)
			return true;
		else
			return false;
	}

	public boolean checkLower(char c){
		if((int)c >= 97 & (int)c <= 122)
			return true;
		else
			return false;
	}

	public String changeCase(String string, String directive){
		char c;
		String output ="";
		for(int i = 0; i < string.length(); i++){
			c = string.charAt(i);
			if(directive.equals("lower")){
				if(checkUpper(c)){
					c = (char)((int)c + 32);
				}
			} else if(directive.equals("upper")){
				if(checkLower(c)){
					c = (char)((int)c - 32);
				}
			}
			output = output + c;
		}
		return output;
	}

	// public static void main(String... args){
	// 	Case obj = new Case();
	// 	String str = "sAiram";
	// 	System.out.println(str);
	// 	String output = obj.changeCase(str, "upper");
	// 	System.out.println(output);
	// }
}