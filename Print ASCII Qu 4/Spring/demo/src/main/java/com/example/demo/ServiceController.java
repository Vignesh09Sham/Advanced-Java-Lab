package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.lang.Object;

import com.mycompany.app.*;

@RestController
public class ServiceController{

	@PostMapping("/printAscii")
	public String ascii(@RequestBody Map<String,Object> input){
		String answer = "";
		ArrayList<String> options = (ArrayList<String>)input.get("options");
		PrintAscii obj = new PrintAscii();
		if(options.get(0).equals("-a")){
			answer = obj.getAscii((String)input.get("data"));
		}
		return(answer);
		
	}
}
