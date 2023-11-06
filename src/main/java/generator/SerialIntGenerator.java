package generator;

public class SerialIntGenerator implements IntGenerator {
    private static int counterPositive;
    private static int counterNegative;

    public SerialIntGenerator() {
        counterPositive = 0;
        counterNegative = 0;
    }

    @Override
    public int nextPositive() {
        if (counterPositive == MAX_INTEGER) {
            counterPositive = 0;
        } else {
            counterPositive++;
        }
        return counterPositive;
    }

    @Override
    public int nextNegative() {
        if (counterNegative == (-MAX_INTEGER)) {
            counterNegative = 0;
        } else {
            counterNegative--;
        }
        return counterNegative;
    }

    @Override
    public String getName() {
        return "Генератор на основе последовательности чисел";
    }
}
