package project128;
import java.util.Scanner;
public class sortarray {
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        int marks[]={3,2,5,7,11,74};
	        for (int i=0;i< marks.length;i++){
	            for (int j=i;j< marks.length-1;j++){
	                int temp=0;
	                if (marks[j]>marks[j+1]){
	                    temp=marks[j+1];
	                    marks[j+1]=marks[j];
	                    marks[j]=temp;
	                }
	            }
	        }
	        System.out.println(marks[3]);
	    }
	}

