public class HollowRectangle {

    public static void hollowRectanglePrint(int numRows, int numCols) {

        for (int i = 1; i <= numRows; i++) {

            for (int j = 1; j <= numCols; j++) {

                if (i == 1 || i == numRows || j == 1 || j == numCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        hollowRectanglePrint(4, 5);
    }
}
