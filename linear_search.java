import java.util.Scanner;

public class linear_search {

    public static int find(int marks[], int  target){
        for (int i=0; i<marks.length; i++){
            if(target == marks[i]){
                return i;
            }
        }

        return -1;
        

    }
    public static void main(String args[]){
        int marks[]={56,776,45,76,98,24,87};
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number that you find: ");
            int  target= sc.nextInt();

            int key= find(marks, target);
            if(key==-1){
                System.out.println("not found");
            }
            else{
                System.out.println("target found on : " + key);
            }


            // int b = sc.nextInt();
    }
}
