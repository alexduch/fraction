package fr.lacombedulionvert.fraction;

public interface Fraction {
  Fraction add(SimpleFraction simpleFraction);

  static Fraction of(int numerator, int denominator) {
    if (numerator == 0) {
      return new Zero();
    }
    return new SimpleFraction(numerator, denominator);
  }
}
