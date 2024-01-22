public class spiral_matrix {

    public static  void Spiral_mat(int matrix[][]){
        int startCol=0;
        int startRow=0;
        int endCol=matrix.length-1;
        int endRow=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            // top

            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            // right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //  bottom

            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(matrix[endCol][j]+" ");
            }
            //  left

             for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
             }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static  void main(String args[]){
        int matrix[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,16,56,12},
            {13,14,45,16}
        };
        Spiral_mat(matrix);
        
    }
}
