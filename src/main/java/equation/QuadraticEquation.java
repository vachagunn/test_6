package equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return  c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        StringBuilder equation = new StringBuilder();

        if (a != 0) {
            if (a == 1) {
                equation.append("x^2");
            } else {
                equation.append((int)a).append("x^2");
            }
        }

        if (b != 0) {
            if (b > 0) {
                equation.append(" + ");
            } else {
                equation.append(" - ");
            }

            if (b == 1) {
                equation.append("x");
            } else {
                equation.append((int)Math.abs(b)).append("x");
            }
        }

        if (c != 0) {
            if (c > 0) {
                equation.append(" + ");
            } else {
                equation.append(" - ");
            }

            equation.append((int)Math.abs(c));
        }

        equation.append(" = 0");
        return equation.toString();
    }

    public boolean isQuadratic() {
        return a != 0;
    }
}
