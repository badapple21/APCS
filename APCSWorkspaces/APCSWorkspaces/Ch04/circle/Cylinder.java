import Circle;

class Cylinder extends Circle {
    private double height;
    private Circle base;
    
    public Cylinder(int r, int h){
        super(r);
        Circle base = new Circle(r);
        height = h;

    }

    public double getVolume(){
        return base.getArea() * height;
    }

}