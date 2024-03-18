public class butterflyPattern {
    
    public static void butterflyPatternPrint(int n){

        // for upper part

        for (int  i= 0 ; i<=n; i++){
            // for stars

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for spaces
            System.out.println();
            // for stars
        }

        //  for lower part

        for(int i=n; i>=1;i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        butterflyPatternPrint(4);
    }
}
