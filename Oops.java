public class Oops {
    public static void main(String args[]){
        Pen p1= new Pen(); 
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1= new Student();
        s1.CalcPercentage(60,60,60);
        System.out.println(s1.percentage);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newcolor){
        color=newcolor;

    }

    void setTip(int newTip){
        tip=newTip;
    }

}

class Student{
    String name;
    int age;
    float percentage; // cgpa

    void CalcPercentage(int math, int eng, int chem){
        percentage=(math+eng+chem)/3;
    }

}