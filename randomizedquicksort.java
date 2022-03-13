package project146;
import java.util.Arrays;
import java.util.Random;
public class randomizedquicksort {
	   public static void quick_sort(int arr[],int low,int high){
	        if(low<high){
	            int p=pivotly(arr,low,high);
	            quick_sort(arr,low,p-1);
	            quick_sort(arr,p+1,high);
	        }
	    }
	    public static int pivotly(int arr[],int low,int high){
	        int i=low;
	        int j=low;
	        random(arr,low,high);
	        int pivot=arr[high];
	        while(i<=high){
	            if(arr[i]<=pivot){
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	                j++;
	            }
	            i++;
	        }
	        return j-1;
	    }

	    public static void random(int arr[],int low,int high)
	    {

	        Random rand= new Random();
	        int pivot = rand.nextInt(high-low)+low;

	        int temp1=arr[pivot];
	        arr[pivot]=arr[high];
	        arr[high]=temp1;
	    }
	    public static void main(String[] args) {
	        int arr[]={6,4,2,1,7,5,8,9,3};
	        quick_sort(arr,0, arr.length-1);
	        System.out.println(Arrays.toString(arr));
	    }
}
