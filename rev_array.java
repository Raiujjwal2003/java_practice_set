public class rev_array {

    public static void reverce(int arr[]){
         int first=0 , last=arr.length-1;

         while(first<last){

             int temp= arr[last];
             arr[last]= arr[first];
             arr[first]= temp;

             first++;
             last--;
         }
    }

    public static void main(String args[]){
        int arr[]={3,4,23,34,6,4};
        reverce(arr);
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
    }
}
