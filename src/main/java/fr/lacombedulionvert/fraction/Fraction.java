package fr.lacombedulionvert.fraction;

public interface Fraction {
    Fraction ZERO = new Zero();

    static Fraction of(int numerator) {
        return of(numerator, 1);
    }

    static Fraction of(int numerator, int denominator) {
        if (numerator == 0) {
            return ZERO;
        }
        return new SimpleFraction(numerator, denominator);
    }

    Fraction add(Fraction simpleFraction);
}
