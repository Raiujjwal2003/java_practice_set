public class PalindromeStr {
    
    public static boolean Pallindrome_check(String str){
        int n=str.length();
        for( int i=0 ; i<=n/2; i++){
           if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
           }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "u";
        System.out.println(Pallindrome_check(str));
    }
}
