package OOPS.properties.inheritance;

public class BoxContents extends BoxWeight{
    String[] contents;
    public BoxContents(String[] contents){
        this.contents = contents;
    }
    //the constructor below is manipulating contents two levels above it. But the super keyword works only for a single level above
    public BoxContents(double length, double width, double height, double weight, String[] contents){
        super(length, width, height, weight);//this super is calling the constructor which is present in its parent class
                                             //the parent i.e. boxWeight has another super keyword in the constructor we are calling which in turn calls the constructor from the class Box
                                             //so, indirectly we can call the constructor from any level
        this.contents = contents;
    }
}
