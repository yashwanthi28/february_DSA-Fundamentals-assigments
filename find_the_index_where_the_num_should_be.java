package project122;

public class find_the_index_where_the_num_should_be {
	    public static int find_place(int arr[],int target){
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
	        System.out.println(find_place(arr,target));
	    }
	}

