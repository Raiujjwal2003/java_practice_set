public class MaX {
    public static void main(String args[]){
        int arr[]={1,5,3,7,3};
        int max= arr[0];
        int min= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            if(arr[i]<min){
                min=arr[i];

            }
            
        }
        System.out.println(max);
        System.out.println(min);
    }
}
