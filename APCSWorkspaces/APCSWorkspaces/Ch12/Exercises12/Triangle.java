// Chapter 12 Question 6

abstract class Triangle {
  private double side;

  public Triangle(double side) {
    this.side = side;
  }

  abstract public double getPerimeter();

  abstract public double getArea();

  public double getRatio() {
    return getArea() / getPerimeter();
  }

  public double getSide(){
    return side;
  }

}
