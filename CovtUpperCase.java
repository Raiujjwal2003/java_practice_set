// import javax.print.DocFlavor.STRING;

public class CovtUpperCase {

    public static String UpperCase(String str){
        StringBuilder sb= new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString() ;
    }

    public static void main(String args[]){
        String str="hei i am ujjwal rai";
        System.out.println(UpperCase(str));

    }
}
