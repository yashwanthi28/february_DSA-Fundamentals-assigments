package project127;
public class intersectionoftwoarrays {
	    public static void main(String[] args) {
	        int a[] = {2,5,28,19,48,12,17,9,4};
	        int b[] = {10,2,4,55,9,15,28,19,18};
	        int n = a.length;
	        int m = b.length;
	        int i = 0;
	        int j = 0;
	        while (i < n && j < m) {
	            if (a[i] < b[j]) {
	                i++;
	            } else if (b[j] < a[i]) {
	                j++;
	            } else {

	                System.out.print(a[i] + " ,");
	                i++;
	                j++;
	            }
	        }
	    
	    }
}
	