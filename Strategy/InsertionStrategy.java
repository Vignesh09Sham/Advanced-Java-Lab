public class InsertionStrategy implements Strategy{
	public double[] sort(double arr[]){
		int pass = 1, i = 0;
		double temp = 0;

		for(pass = 1; pass < arr.length; pass++){
			temp = arr[pass];
			for(i = pass - 1; i >=0; i--){
				if(temp >= arr[i])
					break;
				else{
					arr[i+1] = arr[i];
				}
			}
			arr[i+1] = temp;
		}
		return arr;
	}

	// public static void main(String... args){
	// 	InsertionStrategy bs = new InsertionStrategy();
	// 	double arr[] = {1,10,3,8,5,7};
	// 	double output[] = bs.sort(arr);

	// 	for(int i=0; i < output.length; i++){
	// 		System.out.println(output[i] + " ");
	// 	}
	// }
}