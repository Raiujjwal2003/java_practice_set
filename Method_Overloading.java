public class Method_Overloading{
 //Method Overloading= Same name but different parameter.
 public static void main(String args[]){
    Calculator obj=new Calculator();
    obj.sum();
    obj.sum((float)1.1,(float)2.8);
    obj.sum((int)1.1,(int)2.8);
    obj.sum((int)1.1,(float)2.8);
}
}
class Calculator{
int a=5,b=10;
void sum(){
    System.out.println("Sum= "+(a+b));
}
void sum(float x,float y){
    System.out.println("Sum= "+(x+y));
}
void sum(int x,int y){
    System.out.println("Sum= "+(x+y));
}


}