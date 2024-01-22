public class Constractors {
    
    public static void main(String args[]){
        Student s1= new Student();
        Student s2= new Student("ujjwal");
        Student s3= new Student("ujjwal", 234);
        Student s4= new Student(0132201111);

        System.out.println(s2.name);
    }

}

    class Student{
        String name;
        int roll;

        //  non - parameterized constractor
        Student(){
            System.out.println("heyyy....");
        }

        //  parameterized constractor
        Student(String name){
            this.name= name;
        }

        Student(String name, int roll){
            this.name= name;
            this.roll= roll;
            System.out.println("my name is :"+ name +",roll no is :"+ roll);
        }

        Student(int roll){
            this.roll= roll;
            System.out.println("my roll no is :"+roll);
        }
    }