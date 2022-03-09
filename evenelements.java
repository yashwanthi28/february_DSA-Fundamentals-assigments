package project132;

public class evenelements {
	    public static void even_dec(int n){
	        if(n==0){
	            return;
	        }
	        if(n%2==0){
	            System.out.print(n+" ");
	        }
	        n--;
	        even_dec(n);
	    }
	    public static void main(String[] args) {
	        int n=40;
	        even_dec(n);
	    }
	}

