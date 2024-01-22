public class find_fact {
public static int factoraial ( int n){
    for(int i=1; i<=n; i++){
        n=n*i;
    }
    return n;
}
    public static void main(String args[]){
        System.out.println(factoraial(5)) ;
    }
}
