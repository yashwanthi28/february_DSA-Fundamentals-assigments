package project116;
public class sorted_array_of_distinct_integers {
	    public static int sorted_array(int arr[],int target){
	        int i=0;
	        while(i<arr.length){
	            if(arr[i]==target){
	                return i;
	            }
	            else if(arr[i]>target){
	                return i;
	            }
	            else{
	                i++;
	            }
	        }
	        return arr.length;
	    }
	    public static void main(String[] args) {
	        int arr[]={1,3,5,6};
	        int target=2;
	        System.out.println(sorted_array(arr,target));
	    }
	}

