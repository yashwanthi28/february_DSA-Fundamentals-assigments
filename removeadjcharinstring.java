package project150;
import java.util.Stack;
public class removeadjcharinstring {
	    public static void main(String[] args) {
	        String s="geekster";
	        Stack<Character> stack =new Stack<>();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if( !stack.isEmpty() && stack.peek()==ch){
	                stack.pop();
	            }
	            else{
	                stack.push(ch);
	            }
	        }

	        System.out.println(stack);
	    }
	}

