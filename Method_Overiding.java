public class Method_Overiding {
    public static void main(String args[]){
        Son obj =new Son();
        obj.disp();

        
    }
}

class Father{
    int a=5;
    void disp(){
        System.out.println("a");
    }
}
class Son extends Father{
    
    void disp(){
        System.out.println(a);
    }
}
