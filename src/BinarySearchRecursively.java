import java.util.Scanner;

public class BinarySearchRecursively {
	
	public static int binarySearch(int arr[],int si,int ei,int x){
        if(si>ei){
            return -1;
        }
        int midindex=(si+ei)/2;
        if(arr[midindex]==x){
            return midindex;
        }else if(x>arr[midindex]){
            return binarySearch(arr, midindex+1, ei, x);
        }else{
            return binarySearch(arr, si, midindex-1, x);
        }
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
	      int result=binarySearch(arr,0,arr.length-1,ele);
	      System.out.print(result);

	}

}
