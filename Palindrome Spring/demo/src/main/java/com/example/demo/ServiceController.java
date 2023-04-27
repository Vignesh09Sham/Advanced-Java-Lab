package com.project.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ServiceController{

	@PostMapping("/palindrome")
	public String palindrome(@RequestParam Map<String,String> input){
		Palindrome obj = new Palindrome();
		String ans = obj.longestSubstr(input.get("myString"));
		return(ans);
	}
}
