package com.project.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycompany.app.Sorter;

@RestController
public class ServiceController{

	@RequestMapping("/bubble")
	public double[] bubble(){
		Sorter sort = new Sorter();
		double[]  arr = sort.bubble();
		return arr;
	}

	@RequestMapping("/merge")
	public double[] merge(){
		Sorter sort = new Sorter();
		double[]  arr = sort.merge();
		return arr;
	}

	@RequestMapping("/insertion")
	public double[] insertion(){
		Sorter sort = new Sorter();
		double[]  arr = sort.insertion();
		return arr;
	}
}
