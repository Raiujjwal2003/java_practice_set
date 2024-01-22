// package Array;
public class SumOfArray {

    
    public static int Sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[]= {2,3,4,5,6,7};

        System.out.println("Sum of array="+ Sum(arr));
    }

}
