package project135;

public class reverseanum {
	  public static void reverse(int n,String s){
	        if(n%10==0){
	            System.out.println(s);
	            return;
	        }
	        int a=n%10;
	         s+= String.valueOf(a);
	         n=n/10;
	         reverse(n,s);

	    }
	    public static void main(String[] args) {
	        int n=6443746;
	        String s="";
	        reverse(n,s);
	    }
	}

