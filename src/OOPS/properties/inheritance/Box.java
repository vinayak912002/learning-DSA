package OOPS.properties.inheritance;

public class Box {
    double length;
    double width;
    double height;
    Box(){
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }

    //cube
    Box(double side){
        this.height = side;
        this.width = side;
        this.length = side;
    }
    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    //what if we pass the object Box as the parameter
    Box(Box old){
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }
}
