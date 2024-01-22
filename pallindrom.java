public class pallindrom {

    public static void main(String[] args) {
        int sum= 0;
        int number=1221;
        while(number>0){
            sum = sum*10 + number%10;
            number= number/10;

        }
    
        System.out.println(sum);
        if (sum == number) {
            System.out.println("number is pallindrom ");
        }
    }
}
