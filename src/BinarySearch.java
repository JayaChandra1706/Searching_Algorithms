import java.util.Scanner;

public class BinarySearch {
	
	 public static int binarySearch(int arr[],int key){
         int low=0;
         int high=arr.length-1;
         int mid;
         while(low<=high){
             mid=(low+high)/2;
             if(arr[mid]==key){
                 return mid;
             }else if(key>arr[mid]){
                 low=mid+1;
                 high=high;
             }else{
                 high=mid-1;
                 low=low;
             }
         }
         return -1;
    }

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter lenght of array :");
	      int len=scan.nextInt();
	      int arr[]=new int[len];
	       System.out.println();
	      System.out.println("enter the elements of array");
	      for(int i=0;i<=arr.length-1;i++){
	           System.out.print("enter "+i+" element of array:");
	           arr[i]=scan.nextInt();
	      }
	      System.out.println();
	      System.out.print("Enter the Element to Search:");
	      int ele=scan.nextInt();
	      System.out.println();
	      int result=binarySearch(arr,ele);
	      System.out.print(result);
	}

}
