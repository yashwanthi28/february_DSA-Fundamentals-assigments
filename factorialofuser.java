package project133;
public class factorialofuser {
	    public static int fact(int n){
	        if(n==1){
	            return 1;
	        }
	        else{
	            return fact(n-1)*n;
	        }
	    }
	    public static void main(String[] args) {
	        int n=6;
	        System.out.println(fact(n));
	    }
	}

