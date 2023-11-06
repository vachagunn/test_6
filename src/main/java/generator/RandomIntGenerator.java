package generator;

public class RandomIntGenerator implements IntGenerator {
    @Override
    public int nextPositive() {
        return (int)(Math.random() * MAX_INTEGER);
    }

    @Override
    public int nextNegative() {
        return (int)(Math.random() * (-MAX_INTEGER));
    }

    @Override
    public String getName() {
        return "Генератор на основе рандомных чисел";
    }
}
