import java.util.Scanner;
import java.util.*;
    

public class Matrix {

    public static boolean search( int matrix[][], int  key ){
        
         for ( int i=0; i<matrix.length; i++){
            for ( int j=0; j< matrix[0].length; j++){
                if(matrix[i][j]== key ){
                    System.out.println(" found on ("+ i+ ","+ j+")");
                    return true;

                }
            }
         }

         return false;
    }
     public static void main(String args[]){
        int matrix[][]=  new int[3][3];
        Scanner sc= new Scanner(System.in);

        System.out.println("enter value of matrix");
        for(int i=0; i<matrix.length; i++){
            for( int j=0; j<matrix[0].length;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        
        for(int i=0; i<matrix.length; i++){
            for( int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 4);
     }
}
