import java.util.Scanner;
public class find_factorial {
     public static int findFactorial(int n){
        int f= 1;
         for (int i=1; i<=n; i++){
             f= f*i;
         }
         return f;
     }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numebr to  find factorial");
        int num= sc.nextInt();

        int factoraial=  findFactorial(num);
System.out.println(factoraial);
    }
}