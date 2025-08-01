package ObjectOrietedProgramming.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4,4,5);
        System.out.println(box.length+" "+box.width+" "+box.height);

        BoxWeight box3=new BoxWeight();
        System.out.println(box3.height+" "+box3.width);

        BoxColour box4=new BoxColour();
        System.out.println(box4.color + box4.weight + BoxColour.length);
    }
}
