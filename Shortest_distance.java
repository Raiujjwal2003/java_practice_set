
import java.util.*;

public class  Shortest_distance {

    public static  float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir= path.charAt(i);
            // South
            if(dir=='S'){
                y--;
            }
            // North
            else if(dir=='N'){
                y++;
            }
            // East
            else if(dir=='E'){
                x++;
            }
            // West
            else{
                x--;
            }
        }
        int X2= x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Path:");
        String path= sc.next();
        System.out.println(getShortestPath(path));
    }
}
