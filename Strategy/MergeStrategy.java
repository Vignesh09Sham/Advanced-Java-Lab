public class MergeStrategy implements Strategy{
	public double [] sort(double arr[]){
		int i = 0;
		double temp[] = new double[arr.length];

		for(i = 0; i < arr.length; i++){
			temp[i] = 0;
		}

		MSort(arr, temp, 0, arr.length - 1);
		return arr;
	}

	public void Merge(double arr[], double temp[], int lstart, int rstart, int rend){
		int lend = rstart -1;

		int i = lstart, j = rstart, k = lstart;

		while(i <= lend && j <= rend){
			if(arr[i] <= arr[j]){
				temp[k] = arr[i];
				i++;
			}
			else{
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		while(i <= lend){
			temp[k] = arr[i];
			i++;
			k++;
		}

		while(j <= rend){
			temp[k] = arr[j];
			j++;
			k++;
		}

		for(i = lstart; i<=rend; i++){
			arr[i] = temp[i];
		}
	}

	public void MSort(double arr[], double temp[], int l, int r){
		int c = 0;
		if(l < r){
			c = (l + r)/2;
			MSort(arr, temp, l ,c);
			MSort(arr, temp, c+1, r);
			Merge(arr, temp, l, c+1, r);
		}
	}

}
