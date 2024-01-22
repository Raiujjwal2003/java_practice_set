public class invartedStar {
    public static  void main(String args[]){
        int n=5;
        for(int line=1; line<=n; line++){
            for(int star=n; star>=line; star--){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
