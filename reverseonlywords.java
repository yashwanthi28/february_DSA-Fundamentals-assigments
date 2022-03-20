package project151;
import java.util.Stack;
public class reverseonlywords {
	    public static void main(String[] args) {
	        Stack<String> stack=new Stack<>();
	        String s="flower is beautiful";
	        String arr[]=s.split(" ");
	        for(int i=0;i< arr.length;i++){
	            stack.push(arr[i]);
	        }
	        while(!stack.isEmpty()){
	            System.out.print(stack.pop()+" ");
	        }
	    }
	}

