package project140;

public class powerofanum {
	 public static int pow(int num,int pow){
	        if(pow==1){
	            return num;
	        }
	        else{
	            return num*pow(num,pow-1);
	        }
	    }
	    public static void main(String[] args) {
	        int pow=6;
	        int num=6;
	        System.out.println(pow(num,pow));
	    }
}
