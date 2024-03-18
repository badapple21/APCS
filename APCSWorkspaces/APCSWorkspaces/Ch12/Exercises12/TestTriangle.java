public class TestTriangle {

    public static void main(String[] args) {
        EquilateralTriangle equilateralTr = new EquilateralTriangle(10);
        RightTriangle rightTr = new RightTriangle(8);
        System.out.println("Equilateral perimeter = " + equilateralTr.getPerimeter());
        System.out.println("Equilateral area = " + equilateralTr.getArea());
        System.out.println("Equilateral ratio = " + equilateralTr.getRatio() + '\n');
        System.out.println("Right isosceles perimeter = " + rightTr.getPerimeter());
        System.out.println("Right isosceles area = " + rightTr.getArea());
        System.out.println("Right isosceles ratio = " + rightTr.getRatio());

        // throw new IllegalArgumentException("Invalid triangle type");
    }

}