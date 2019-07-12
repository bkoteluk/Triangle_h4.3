public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(8, 6,10, 8);
        TriangleStudy triangleStudy = new TriangleStudy();
        System.out.println(triangle+ " jest prostokątny ? " + triangleStudy.isRightTriangle(triangle));
    }

}
