public class Sphere extends Circle{

    public Sphere(double r){
        super(r);
    }

    @Override
    public double area(){
        return Math.pow(super.radius, 2.0)*4.0*Math.PI;
    }

    public double volume(){
        return Math.pow(super.radius, 3.0)*4.0/3.0*Math.PI;
    }
}