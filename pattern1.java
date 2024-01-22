public class pattern1 {


    public static void holo_star(int noRow , int noCol){
        for(int i=1; i<=noRow; i++){
            for(int j=1; j<=noCol; j++){
                if(i==1 || i==noRow || j==1 || j==noCol){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int noRow =5;
        int noCol=5;

        holo_star(noRow ,noCol);
    }
}
