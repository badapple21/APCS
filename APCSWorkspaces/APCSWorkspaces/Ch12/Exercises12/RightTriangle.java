public class RightTriangle extends Triangle {

    public RightTriangle(double s) {
        super(s);
    }

    public double getPerimeter() {
        return (2 + Math.sqrt(2.0)) * getSide();
    }

    public double getArea() {
        return getSide() * getSide() / 2;
    }
}
