package calculator;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double square(double a) {
        return a * a;
    }

    public double inverse(double a) {
        return 1 / a;
    }

    public double percent(double a, double b) {
        return a * (b / 100);
    }
}
