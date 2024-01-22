public class Overloading {
    public static void main(String args[]){
        Father obj=new Father();
        obj.sum();
        obj.sum(10,10);
        obj.sum((float)5.3,(float)9.2);
    }
}

class Father{
    int a=5,b=10;
    void sum(){
        System.out.println(a+b);
    }
    void sum(int x,int y){
        System.out.println(x+y);
    }
    void sum(float c,float d){
        System.out.println(c+d);
    }
}
