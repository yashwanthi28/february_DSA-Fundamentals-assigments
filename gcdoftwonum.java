package project141;

public class gcdoftwonum {
	   public static void gcd(int divisor,int divident){
	        if(divident%divisor==0){
	            System.out.println(divisor);
	            return;
	        }
	        gcd(divident%divisor,divisor);
	    }
	    public static void main(String[] args) {
	        int a=6;
	        int b=4;
	        gcd(a,b);
	    }
	}

