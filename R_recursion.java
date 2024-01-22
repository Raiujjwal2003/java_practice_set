public class R_recursion {
    
    public static void number(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        number(n+1);
    }
    public static void main(String args[]){
        // System.out.println();
        number(1);
    }
}
