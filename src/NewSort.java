
public class NewSort {
	
	void InSort(int arr[],int N)
	{
		for(int i=1;i<N;i++)
		{
			int val = arr[i];
			int hole = i;
			
			while(hole>0 && arr[hole-1]>val)
			{
				arr[hole] = arr[hole-1];
				hole--;
			}
			arr[hole] = val;
		
		}
		
		
		
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	}
	public static void main(String[] args) {
		
		NewSort I = new NewSort();
		
		int Arr[] = {35,4,13,65,8,75,2,99};
		int N = Arr.length;
		
		I.InSort(Arr,N);

	}

}
