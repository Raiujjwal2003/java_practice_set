public class bubble_short {
    

    public static void Booble_short(int array[]){

        for ( int i=0; i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    // swap

                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
             
            }
            
        }

    }

    public static void print_array(int array[]){
            for(int i=0; i<array.length; i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int number[]= {34,43,62,22,18};
        Booble_short(number);
         print_array(number);
    }
}
