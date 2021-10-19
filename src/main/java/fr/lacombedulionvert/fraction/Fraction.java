package fr.lacombedulionvert.fraction;

public record Fraction(int value, int denominator) {

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  public Fraction add(Fraction fraction) {
    if(fraction.value == 0) {
      return this;
    }
    return new Fraction(value + fraction.value);
  }
}
