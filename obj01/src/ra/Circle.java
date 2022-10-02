package ra;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, Boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double Area(){
        return 2*radius * Math.PI;
    }
    @Override
    public String toString(){
        return " A circle with radius ="
                + getRadius()
                + ", with is a subclass of "
                + super.toString();

    }

}
