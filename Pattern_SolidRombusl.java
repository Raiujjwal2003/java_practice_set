/**
 * Pattern_SolidRombusl
 */
public class Pattern_SolidRombusl {

    public static void SolidRombus(int n){
        for (int i=1; i<=n; i++){
            // print spaces

            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // print stars

            for (int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
     public static void main(String[] args) {
         SolidRombus(5);
     }
}