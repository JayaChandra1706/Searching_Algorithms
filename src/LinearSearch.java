import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int arr[],int ele) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==ele) {
				return i;
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
	      int result=linearSearch(arr,ele);
	      System.out.print(result);
	   	}
}
