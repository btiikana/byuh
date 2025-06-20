public class ReturnType {
    public ReturnType() {
        var myTriangle = getTriangleArea(12, 7);
        System.out.println("My triangle area is " + myTriangle);
    }

    public double getTriangleArea(double base, double height) {
        double area = (base * height) / 2;
        return area;
    }

    public static void main(String[] args) {
        new ReturnType();
    }
}
