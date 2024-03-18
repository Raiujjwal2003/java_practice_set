public class Pattern_DiamondPattern {

    public static void DiamondPattern(int n){
        //  upper side

        for (int i=1; i<=n; i++){
            // for spaces logis is n-i
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //  for stars logis is 2x-1

            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //  lower side

        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //  for stars logis is 2x-1

            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        DiamondPattern(4);
    }
}
