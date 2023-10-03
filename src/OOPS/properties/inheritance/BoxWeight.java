package OOPS.properties.inheritance;
//we want this class to have all the properties of the box class
//for that we simply use the extends keyword

//The subclass inherits the properties of its superclass, but it is not able to access the private variables,functions or classes.(anything private can only be accessed in that file)
//but in the case of super keyword we are able to initialize the private variables also.(super keyword initializes the parent, not the subclass)
public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(double weight){
        this.weight = weight;
    }
    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);//the super keyword is calling the parent class constructor
        //super can also be used as the this keyword. It will access the parent variables
        this.weight = weight;
    }
}
