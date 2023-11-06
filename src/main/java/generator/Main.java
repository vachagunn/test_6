package generator;
import equation.*;

public class Main {
    public static void main(String[] args) {
        demoQuadraticEquation();
        demoIntGenerator();
    }

    public static void demoQuadraticEquation() {
        QuadraticEquation[] equations = new QuadraticEquation[]{
                new QuadraticEquation(1,2,1),
                new QuadraticEquation(0,5,2),
                new QuadraticEquation(2,0,8),
                new QuadraticEquation(3,2,0),
                new QuadraticEquation(1,-2,1)
        };

        for (QuadraticEquation equation: equations) {
            System.out.println(equation.toString());
            System.out.println("Is quadratic? " + equation.isQuadratic());
        }
    }

    public static void demoIntGenerator() {
        IntGenerator[] generators = new IntGenerator[] {
            new RandomIntGenerator(),
            new TimeDependetIntGenerator(),
            new SerialIntGenerator()
        };

        for (int i = 0; i < 15; i++) {
            for (IntGenerator generator: generators) {
                System.out.println(generator.getName());
                System.out.println("Случайное положительное число: " + generator.nextPositive());
                System.out.println("Случайное отрицательное число: " + generator.nextNegative());
            }
        }
    }
}
