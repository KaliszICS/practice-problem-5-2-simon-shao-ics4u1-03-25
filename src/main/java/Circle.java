public class Circle{

    protected double radius;

    public Circle(double r){
        this.radius = r;
    }

    public double diameter(){
        return this.radius*2;
    }

    public double perimeter(){
        return this.radius*2.0*Math.PI;
    }

    public double area(){
        return Math.pow(this.radius, 2.0)*Math.PI;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }
}