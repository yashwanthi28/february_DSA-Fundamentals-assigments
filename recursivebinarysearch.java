package project137;

public class recursivebinarysearch {
	public static void binarySearch(int arr[],int target,int low,int high){
        if(low>high){
            System.out.println("element is not present");
            return;
        }
        int mid=(low+high)/2;
        if(arr[mid]==target){
            System.out.println("element present at "+mid+" index");
            return;
        }
        else if(arr[mid]<target){
            binarySearch(arr,target,mid+1,high);
        }
        else if(arr[mid]>target){
            binarySearch(arr,target,low,mid-1);
        }

    }
    public static void main(String[] args) {
        int arr[]={3,1,4,7,1,0,64,37,9,1};
        int target=7;
        binarySearch(arr,target,0, arr.length-1);

    }
}
