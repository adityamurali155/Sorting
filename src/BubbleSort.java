
public class BubbleSort {

	void BubSort(int arr[],int N)
	{
		for(int i=0;i<N;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	}
	public static void main(String[] args) {
		
			BubbleSort B = new BubbleSort();
			
			int Arr[] = {35,4,13,65,8,75,2,99};
			int N = Arr.length;
			
			B.BubSort(Arr,N);
		

	}

}
