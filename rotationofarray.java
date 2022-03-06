package project125;
import java.util.Scanner;
public class rotationofarray {
	    public static void reverse(int arr[] ,int start_index,int last_index) {
	        int i = start_index;
	        int j = last_index;
	        while (i < j) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("enter the size of array");
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        System.out.println("start filling the array");
	        for(int i=0;i<arr.length;i++){
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("enter the number how much time you want to rotate the array");
	        int rotation=sc.nextInt();

	        if(rotation>0 && rotation<arr.length){
	            reverse(arr, 0,arr.length-1-rotation);
	            reverse(arr,arr.length-rotation,arr.length-1);
	            reverse(arr,0,arr.length-1);
	        }
	        if(rotation<0){
	            reverse(arr,0,arr.length-1);
	            reverse(arr,0, arr.length-1+rotation);
	            reverse(arr,arr.length+rotation,arr.length-1);
	        }
	        if(rotation>arr.length){
	            rotation=rotation- arr.length;
	            reverse(arr, 0,arr.length-1-rotation);
	            reverse(arr,arr.length-rotation,arr.length-1);
	            reverse(arr,0,arr.length-1);

	        }
	        for(int j=0;j<arr.length;j++){
	            System.out.print(arr[j]+ "  ");
	        }
	    }
	}

