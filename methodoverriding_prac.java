public class methodoverriding_prac {
    public static void main(String args[]){
        Calculator obj= new Calculator();
        obj.sum(8, 7);
        obj.sum(8, (float)1.4);
    }
}

class Calculator{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(float a, int b){
        System.out.println(a+b);
    }
    void sum(float a, float b){
        System.out.println(a+b);
    }
    void sum(int a, float b){
        System.out.println(a+b);
    }

}
