package fr.lacombedulionvert.fraction;

public record Fraction(int numerator, int denominator) {

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  public Fraction add(Fraction fraction) {
    return new Fraction(numerator *fraction.denominator+fraction.numerator *denominator,
              denominator*fraction.denominator);

  }
}
