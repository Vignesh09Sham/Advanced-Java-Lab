public class Sorter{
	Strategy strategy;

	Sorter(){
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

	public static void main(String... args){
		Sorter sorter = new Sorter();
		sorter.setStrategy(new BubbleStrategy());
		double arr[] = {10,14,12,1,2,3,4};
		double output1[] = sorter.sort(arr);
		System.out.println("Bubble Sort:");
		sorter.display(output1);

		double output2[] = sorter.sort(arr, new InsertionStrategy());
		System.out.println("Insertion Sort:");
		sorter.display(output2);

		double output3[] = sorter.sort(arr, new MergeStrategy());
		System.out.println("Merge Sort:");
		sorter.display(output3);
	}
}
