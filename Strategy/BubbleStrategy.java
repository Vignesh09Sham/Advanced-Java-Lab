public class BubbleStrategy implements Strategy{
	public double[] sort(double arr[]){
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[i]){
					double temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
}