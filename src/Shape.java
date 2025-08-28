public class Shape {
    public void draw(double l, double b){
        double area = l*b;
        System.out.println("Area Reactangle "+area);
    }

    public void draw(double l){
        double area = l*l;
        System.out.println("Area Square "+area);
    }
}
