package generator;

public interface IntGenerator {
    public int MAX_INTEGER = 1000;

    int nextPositive();
    int nextNegative();
    String getName();
}
