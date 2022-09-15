package question7;


public class Sort {
public static void binarySearch(int arr[],int first,int last,int key)
{
	int mid=(first+last)/2;
	while (first <=last)
	{
		if (key >arr[mid]) {
			first =mid+1; 
		}
			else if (arr[mid]==key) {
				System.out.println("element is found at index :"+ mid);     
				break;
			}
			else {
				last =mid-1;
				}
		
					mid =(first +last )/2;
				}
			if (first >last) {
			System.out.println("element is not found");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
int key=19;
int last=a.length-1;
binarySearch(a,0,last,key);
	}

}
