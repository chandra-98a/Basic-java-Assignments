package question8;

public class BubbleSort{
static void bubbleSort(int arr[]) {
	int n =arr.length;
	int temp =0;
	for (int i =0 ; i <n; i++) {
		for (int j=1; j <(n-i); j++) {
			if (arr[j-1]>arr[j])
			{//swap
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
			}
			}
		System.out.println();
		System.out.println("array after sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {50,40,30,20,10};
 System.out.println("Array Before Bubble sort");
 for (int i=0;i<arr.length ;i++) {
	 System.out.println(arr[i]+" ");  
	 }
 bubbleSort(arr);
 
	}

}
