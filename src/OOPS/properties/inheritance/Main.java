package OOPS.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        //if no arguments are passed the constructor having no arguments will be called
        Box newBox1 = new Box();
        System.out.println(newBox1.length+" "+newBox1.width+" "+newBox1.height);
        //similarly if three arguments are passed the constructor having three parameters will be called
        Box newBox2 = new Box(4,5,6);
        System.out.println(newBox2.length+" "+newBox2.width+" "+newBox2.height);


        BoxWeight newBox3 = new BoxWeight();
        System.out.println(newBox3.length+" "+newBox3.width+" "+newBox3.height);
        //as we know that we initialize an object then only we can use the variables or functions that apply to that object
        //so if we instantiate the child class so that it will become a reference, so it will call the constructor present in the child class
        Box newBox4 = new BoxWeight(4,5,6,85);//here the reference is of type Box which is pointing to an object of type BoxWeight
        //but, we cannot do the opposite because the parent class does not know about the contents of the child class so if the object is of the type Box and the reference is  of type BoxWeight the object Box will have no means to know about the variable weight
        //that is why we are not able to do BoxWeight box = new Box();
    }
}
