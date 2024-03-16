public class HalfAndRotatedPmd {

    public static void HalfAndRotatedPmdPrint(int n){
        for(int i=1; i<=n; i++){
            // spaces

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            // Stars

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
            HalfAndRotatedPmdPrint(4);
    }
    
}
