package com.mycompany.app;

public class Sorter{
	Strategy strategy;

	public Sorter(){
		strategy = null;
	}

	double[] sort(double arr[], Strategy strategy){
		return strategy.sort(arr);
	}

	double[] sort(double arr[]){
		return strategy.sort(arr);
	}

	void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}

	void display(double arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
		}
	}

	public double[] bubble(){
		Sorter sorter = new Sorter();
		sorter.setStrategy(new BubbleStrategy());
		double arr[] = {10,14,12,1,2,3,4};
		double output1[] = sorter.sort(arr);
		return(output1);
	}

	public double[] merge(){
		double arr[] = {20,15,30,6,5,8,9};
		Sorter sorter = new Sorter();
		double output2[] = sorter.sort(arr, new MergeStrategy());
		return(output2);

	}

	public double[] insertion(){
		double arr[] = {10,87,3,1,45,990,2};
		Sorter sorter = new Sorter();
		double output3[] = sorter.sort(arr, new InsertionStrategy());
		return(output3);
	}
}
