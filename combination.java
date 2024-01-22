import java.util.*;


public class combination {

    public static int find_factorial(int n){
        int f= 1;
         for (int i=1; i<=n; i++){
             f= f*i;
         }

         return f;
     }


    public static int calCombination(int n , int r){
            int calFacr_n= find_factorial(n);
            int calFact_r= find_factorial(r);
            int calFact_nmr= find_factorial(n-r);

            int combination= calFacr_n/(calFact_r*calFact_nmr);

            return combination;

            // return calFacr_n;
    }

    public static  void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter parameter to find combination");
        int n= sc.nextInt();
        int r= sc.nextInt();

        int comb= calCombination(n,r);

        System.out.println(comb);
    }
}
