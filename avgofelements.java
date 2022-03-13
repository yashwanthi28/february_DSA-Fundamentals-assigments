package project136;

public class avgofelements {
	 public static void average(int arr[],double result,int i){
	        if(i==arr.length){
	            System.out.println(result/ arr.length);
	            return;
	        }
	        result+=arr[i];
	        i++;
	        average(arr,result,i);

	    }
	    public static void main(String[] args) {
	        int arr[]={3,5,1,2,5,7,8,9};
	        double result=0;
	        average(arr,result,0);
	    }
}
