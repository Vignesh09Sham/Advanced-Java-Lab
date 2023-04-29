package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.lang.Object;

import com.mycompany.app.*;

@RestController
public class ServiceController{

	@PostMapping(value = "/case")
	public String caseConverter(@RequestBody Map<String,Object> input){
		String answer = "";
		ArrayList<String> options = (ArrayList<String>)input.get("options");
		Case obj = new Case();
		System.out.println(options.get(1));
		System.out.println((String)input.get("data"));
		if(options.get(0).equals("-c")){
			answer = obj.changeCase((String)input.get("data"), options.get(1));
		}
		return(answer);
		
	}
}
