package OOPS;

public class WrapperExamples {
    public static void main(String[] args) {
        int a = 65;//primitive
        int b = 50;

        swap(a, b);//a and b do not get swapped because in java there is no pass by reference. There is only pass by value.(see Main)
        //But for objects reference value is passed.
        System.out.println(a + " " + b);

        Integer num1 = 45; //Object of the wrapper class Integer
        Integer num2 = 80;
        //the advantage of using the wrapper class is that it has many methods that we can apply on it
        //to experiment do a. and num. in intellij Idea, you will see the difference.
        swap(num1, num2);//according to our concept they should have been swapped, but they do not. Why?
        //because Integer is a final class.
        System.out.println(num1 + " " + num2);

        final float pi = 3.414f;//the variables with final keyword cannot be modified. But this applies to the primitive datatypes only.
        //since the reference of the object datatype is passed, the value can be changed.
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(Integer a, Integer b){ //remember function overloading
        Integer temp = a;
        a = b;
        b = temp;
    }
}
