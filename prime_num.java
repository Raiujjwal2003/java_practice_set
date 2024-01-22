public class prime_num {
    
    public static  boolean IsPrime(int n){
        for ( int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n=7;
        System.out.println(IsPrime(n));
        // int prime= IsPrime(n);
    }
}
