package fr.lacombedulionvert.fraction;

public record SimpleFraction(int numerator, int denominator) implements Fraction {

    public SimpleFraction(int numerator) {
        this(numerator, 1);
    }

    @Override
    public Fraction add(Fraction fraction) {
        if (fraction instanceof SimpleFraction simpleFraction) {
            return new SimpleFraction(
                    numerator * simpleFraction.denominator + simpleFraction.numerator * denominator,
                    denominator * simpleFraction.denominator);
        } else {
            return fraction.add(this);
        }
    }
}
