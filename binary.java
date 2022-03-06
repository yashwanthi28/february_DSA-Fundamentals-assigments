package project114;

public class binary {
	    static int bs(char arr[], char target) {

	        int low = 0, high = arr.length - 1;

	        while (low <= high) {
	            
	            int mid = low + (high - low) / 2;
	            if (arr[mid] == target)
	                return mid;
	            else if (arr[mid] < target) {
	                low = mid + 1;
	            } else
	                high = mid - 1;
	        }
	        
	        return -1;
	    }

	    public static void main(String[] args) {
	        char arr[] = {'a','b','d','e','f','g','h','i','x','z'};
	        char target = 'z';
	        System.out.println(bs(arr, target));
	    }

	}

