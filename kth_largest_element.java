package project163;
import java.util.Comparator;
import java.util.PriorityQueue;
public class kth_largest_element {
	    public static int findKthLargest(int[] nums, int k) {
	        PriorityQueue<Integer> minheap=new PriorityQueue<>(); // for max heap decleration (Comparator.reverseOrder)
	        for(int i=0;i<k;i++){
	            minheap.add(nums[i]);
	        }
	        for(int i=k;i< nums.length;i++){
	            if(nums[i]> minheap.peek()){
	                minheap.poll();
	                minheap.add(nums[i]);
	            }
	        }
	        return minheap.peek();
	    }
	    public static void main(String[] args) {
	        int nums[]={6,3,7,2,1,8};
	        int k=2;
	        System.out.println(findKthLargest(nums,k));
	    }
	}

