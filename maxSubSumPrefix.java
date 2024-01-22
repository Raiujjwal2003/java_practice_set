public class maxSubSumPrefix {
    
      
        public static int sub_array(int arr[]){
            int max_sum=0;
            int prefix[]= new int[arr.length];
            prefix[0]=arr[0];
    
            // calculate prefix array
            
             for(int i=1; i<prefix.length; i++){
                prefix[i]= prefix[i-1]+arr[i];
             }
    
             int  Cur_sum=0;
            for ( int i=0; i <arr.length; i++){
                for(int j=i; j<arr.length; j++){    
                    
                    Cur_sum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                        if( Cur_sum>max_sum){
                            max_sum= Cur_sum;
                        }
                }
            }
            return max_sum;
        }

        
        public static void main(String args[]){
            int arr[]= {1,-2,6,-1,3};
            int MaxSum=sub_array(arr);
          
                System.out.println("Maximum sum of sun array's:"+ MaxSum);
       
        }
    
    }
    

