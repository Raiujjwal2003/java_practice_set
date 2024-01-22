import java.util.*;
public class Find_Maximum_Minimum {

    public static  void max_elem(int arr[]){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maximin  element in array is= "+ max);
    }
    public static  void min_elem(int arr[]){
        int min=0;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("minimin  element in array is= "+ min);
    }
    public static void main(String args[]){

        int arr[]={2,3,7,4,76,34,65};
        max_elem(arr);
        min_elem(arr);
    }
}
