package project124;
import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int arr[]={1,4,7,22,34,13,678,421,422};
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

