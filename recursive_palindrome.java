package project134;

public class recursive_palindrome {
	 public static boolean palindrome(String s,int i,int j){
	        if(i==j || i>j){
	            return true;
	        }
	        if(s.charAt(i)!=s.charAt(j)){
	            return false;
	        }
	        else{
	            palindrome(s,++i,--j);
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        String s="saurabh0hbaruas";
	        System.out.println(palindrome(s,0,s.length()-1));
	    }
	}


