public class HalpPiramidWithNumber {

    public static void HalpPiramidWithNumberPrint(int n){
        for ( int  i = 1; i<=n; i++){

            // for number
            for( int j=1; j<=n-i+1; j++){
                System.out.print(j+"");
            }
         System.out.println();   
        }
    }
    public static void main(String[] args) {
        HalpPiramidWithNumberPrint(5);
    }
}
