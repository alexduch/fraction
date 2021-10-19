package fr.lacombedulionvert.fraction;

public record Fraction(int value, int denominator) {

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  public Fraction add(Fraction fraction) {
    return new Fraction(value + fraction.value);
  }
}
