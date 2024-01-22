import java.util.*;

public class condition {
     public static void main(String args[]){
  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = scanner.nextInt();
        scanner.close();

        if(age>=18){
            System.out.println("eligible for vote");
        }

        else if (age>=13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not elligible");
        }
     }
}
