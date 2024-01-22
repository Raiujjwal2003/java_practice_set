public class Sub_string {

    public static String Substring(String Str, int si , int ei){
        String subStr="";
        for(int i=si; i<=ei-1; i++){
            subStr += Str.charAt(i);
        }
        return subStr;
    }

    public static void main(String args[]){
        String  str= "helloWould";
        System.out.println(str.substring(0, 3));
        System.out.println(Substring(str, 0, 3));

    }
}
