package recap.overrideandoverload;

public class SumCalculator implements Calculator{
    @Override
    public Integer apply(final int a, final int b) {
        return a + b;
    }

    @Override
    public Integer apply(final int a, final int b, final int c) {
        return a + b + c;
    }
}
