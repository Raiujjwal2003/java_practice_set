public class largest_number {

    public static int largest_num(int arr[]){

        int larg_num=Integer.MIN_VALUE;
        int smallest_value= Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(larg_num<arr[i]){
                larg_num= arr[i];
            }

            if(smallest_value>arr[i]){
                smallest_value=arr[i];
            }
        }
         System.out.println("smallest value is: "+ smallest_value);
        return larg_num;
    }
    public static void main(String args[]){
        int arr[]={4,6,900,8,91};
        int big_number=largest_num(arr);
        System.out.println("largest Value is: "+ big_number);
    }
}
