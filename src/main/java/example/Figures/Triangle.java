package example.Figures;


import java.math.BigDecimal;

public class Triangle implements Figure {
    private double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double perimetr() {
        return a + b + c;
    }

    @Override
    public double area() {
        double p = perimetr();
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
