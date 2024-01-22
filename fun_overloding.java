public class fun_overloding {

    
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    
    public static void main(String args[]){
        int a=4;
        int b=5;
         int c=9;

         int sum_of_two= sum(a,b);
         int sum_of_three= sum(a,b,c);

         System.out.println(sum_of_two);
         System.out.println(sum_of_three);
    }
}
