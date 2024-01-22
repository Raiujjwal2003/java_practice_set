public class maxSumKdans{

    public static void Kdans(int number[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<number.length;i++){
            cs= cs+number[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max Sum of Sub array is:"+ms);
    }
    public static void main(String args[]){
        int number[]= {-1,-2,6,-1,4};
        Kdans(number);
    }
}