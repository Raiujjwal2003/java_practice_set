public class Max_subarraySum {
    
      // brute force method for calculating any problem

    public static int sub_array(int arr[]){
        int totSubArr=0;
        int max_sum=Integer.MIN_VALUE;
        for ( int i=0; i <arr.length; i++){
            
            for(int j=i; j<arr.length; j++){
                
                int  Cur_sum=0;
                for(int k=i; k<=j; k++){
                     Cur_sum += arr[k];
                    if( Cur_sum>max_sum){
                        max_sum= Cur_sum;
                    }

                }
                totSubArr++;
              System.out.print("total sum :"+Cur_sum);
                System.out.println();
            }
            System.out.println();
        }


        System.out.println("total number of sub array:"+ totSubArr);
        return max_sum;
    }
    public static void main(String args[]){
        int arr[]= {-8, -2, -6, -5, -4};
        int MaxSum=sub_array(arr);
      
            System.out.println("Maximum sum of sun array's:"+ MaxSum);
   
    }

}
