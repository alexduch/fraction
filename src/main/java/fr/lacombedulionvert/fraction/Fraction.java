package fr.lacombedulionvert.fraction;

public record Fraction(int value, int denominator) {

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  public Fraction add(Fraction fraction) {
    if(fraction.value == 0) {
      return this;
    } else if(this.value == 0) {
      return fraction;
    }
    return new Fraction(value + fraction.value);
  }
}
