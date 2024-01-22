import java.util.*;

public class Strings {

    //  print indivisual string 
    
    public static void PrintStr(String str){
        for( int i=0; i< str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        char array[]={'a','b','c','d'};
        String chr ="abcd";
        String chr1= new String("xyz");
        System.out.println(chr1);

        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("enter name:");
        name=sc.nextLine();
        System.out.println(name.length());
        PrintStr(chr);


        //  concatination of Strings

        String FirstName= "ujjwal";
        String LastName= "rai";
        String FullName= FirstName +" "+LastName;
        System.out.println(FullName);
    }
}
