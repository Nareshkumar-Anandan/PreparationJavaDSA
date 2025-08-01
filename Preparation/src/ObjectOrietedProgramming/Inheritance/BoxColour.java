package ObjectOrietedProgramming.Inheritance;

public class BoxColour extends BoxWeight{
    String color;
    public BoxColour(){
        this.color = "black";
    }
    public BoxColour(double length){
        super(length);
        this.length=length;
    }
    public BoxColour(double weight, String color) {
        super(weight);
        this.color=color;
    }
    public BoxColour(double weight, String color,double height, double length, double width) {
        super(length, width, height, weight);
        this.color=color;
    }
}
