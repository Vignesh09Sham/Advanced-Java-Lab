package com.project.demo;
import java.io.*;
import java.util.*;

public class Palindrome{
	public boolean checkPalindrome(String str){
		int i = 0, j = str.length() - 1;
		while(i < j){
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public String longestSubstr(String str){
		String subStr = "", longestSubstr = "";
		if(checkPalindrome(str)){
			return str;
		}else{
			for(int i= 0; i < str.length(); i++){
				for(int j = i + 1; j <= str.length(); j++){
					subStr = str.substring(i, j);
					if(checkPalindrome(subStr)){
						if(subStr.length() > longestSubstr.length()){
							longestSubstr = subStr;
						}
					}
				}
			}
			return longestSubstr;
		// ArrayList<String> subStr = new ArrayList<String>();
		// 	for(int i = 0; i < str.length(); i++){
		// 		for(int j = 1; j < str.length(); j++){
		// 			if(checkPalindrome(str.substring(i, j))){
		// 				subStr.add(str.substring(i, j));
		// 				for(String substring: subStr){
		// 					if(substring.length() > maxlength){
		// 						maxlength = substring.length();
		// 						longestStr = substring;
		// 					}
		// 				}
		// 				return longestStr;
		// 			}
		// 		}

		// 	}
		// 	return str.substring(0,1);
		}
		
	}
	public static void main(String... args){
		String word = "adaaa";
		String ans = null;
		Palindrome obj = new Palindrome();

		ans = obj.longestSubstr(word);
		System.out.println(ans);
	}
}
