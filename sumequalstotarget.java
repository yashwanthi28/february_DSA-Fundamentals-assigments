package project129;

public class sumequalstotarget {
	    public static void main(String[] args) {
	        int arr[]={3,2,6,-7,-1,9,8};
	        int target=4;
	        for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length;j++) {
	                if (arr[i]+arr[j] ==target) {
	                    System.out.println(arr[i] + " at the position " + i+" and "+arr[j]+" at position "+j);
	                }
	            }
	        }
	    }
	}

