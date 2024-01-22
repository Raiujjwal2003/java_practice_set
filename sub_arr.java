public class sub_arr {
        
        public static void sub_array(int arr[]){
            int ts=0;
            for ( int i=0; i <arr.length; i++){

                for(int j=i; j<arr.length; j++){

                    int sum=0;
                    for(int k=i; k<=j; k++){
                        System.out.print(arr[k]+",");
                        sum= sum+arr[k];
                    }
                    ts++;
                    System.out.print(": total sum :"+sum);
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("total number of sub array:"+ ts);
        }
        public static void main(String args[]){
            int arr[]= {2,3,4,5,6,7,1};
            sub_array(arr);
        }
}
