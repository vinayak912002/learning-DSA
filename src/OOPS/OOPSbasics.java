package OOPS;

//classes are grouped collection of variables and functions.
// . - the dot is used as a separator in java
//new keyword - is used to
public class OOPSbasics {
    public static void main(String[] args) {
        Student student1; //declaration of the class variable
        student1 = new Student();//instantiation and initialization of the object box
        //every datatype has a default value which is assigned to it in if no value is provided
        System.out.println(student1);
        System.out.println(student1.rollNo);
        System.out.println(student1.name);//the default value of any object is null in java
        System.out.println(student1.marks);
        //we can fix the values of the variables in the instance of a class
        Student student2 = new Student();

        student2.rollNo = 1;
        student2.name = "Vinayak Pandey";
        student2.marks = 55.5f;

        System.out.println(student2.rollNo);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        Student2 arpit = new Student2(2, "Arpit Gupta", 69.5f);
        System.out.println(arpit.rollNo);
        System.out.println(arpit.name);
        System.out.println(arpit.marks);

    }
}
class Student{
    int rollNo;
    String name;
    float marks;
}
class Student2{
    int rollNo;
    String name;
    float marks;

    //the function defined below is known as a constructor. It is always called for creating the object of a class
    Student2(int rollNo, String name, float marks){
        //the this keyword when the constructor is called is replaced by the name of the instance

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }
    //we can do something called constructor overloading.we can create multiple constructors with different parameters
    Student2(int rollNo, String name){

        this.rollNo = rollNo;
        this.name = name;

        //so now we can create the object of the class Student2 with or without the marks
    }
    //we can also call a constructor from another constructor
    Student2(){
        //internally : Student2(50, "Azmat Yusuf", 50.5f)

        this(50, "Azmat Yusuf", 50.5f);

        //it is used to pass default values to the parameters if no value is provided
    }

}
