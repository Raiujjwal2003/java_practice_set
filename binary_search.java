import java.util.Scanner;

public class binary_search {

    public static int find_target(int arr[], int target ){
            int start=0, end=arr.length-1;
            while(start <=end ){
                  int mid=(start+end)/2;
                
                  if(arr[mid] == target){
                    return mid;
                  }
                 else if(arr[mid]>target){ // left case
                    end=mid-1;
                  }
                  else { // right case
                    start= mid+1;
                  }
            }
            return -1;
    }

    public static void main(String args[]){
        int marks[]= {10,20,30,40,50,60,70,80};
        
            Scanner sc = new Scanner(System.in);
            // System.out.print("enter target number");
            // int target = sc.nextInt();
             int target = 60;

            int key=find_target(marks, target);
            // System.out.println("number found on : "+ key);


            if(key==-1){
                System.out.println("number not found");
            }
            else{
                System.out.println("number found on : "+ key);
            }
    }
}
