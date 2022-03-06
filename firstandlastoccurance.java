package project123;
import java.util.Scanner;
public class firstandlastoccurance {
	    public static void main(String[] args) {
	        int num[]={1,2,7,4,7,5,6,7,9};
	        int n=7;

	        int pos1=-1;
	        boolean ispresent=false;
	        for (int i = 0; i < num.length; i++) {
	            if(num[i]==n){
	                ispresent=true;
	                pos1=i;
	                break;
	            }
	        }
	        boolean ispresent2=false;
	        int pos2=-1;

	        for (int i = 0; i < num.length; i++) {
	            if(num[i]==n){
	                ispresent2=true;
	                pos2=i;
	            }
	        }
	        if(ispresent||ispresent2){
	            System.out.println("number first come at "+pos1+" position then at last it comes at "+pos2+" position");
	        }
	        else{
	            System.out.println("not present");
	        }
	    }
	}

