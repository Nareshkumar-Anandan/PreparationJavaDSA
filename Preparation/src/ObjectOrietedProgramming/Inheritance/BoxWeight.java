package ObjectOrietedProgramming.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }
    public BoxWeight(double length, double width, double height,double weight){
        super(length,width,height);//call the parent class constructor;
        this.weight=weight;
    }

    public BoxWeight(double weight) {
        this.weight=weight;
    }
}
