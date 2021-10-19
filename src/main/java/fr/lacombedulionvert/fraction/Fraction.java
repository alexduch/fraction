package fr.lacombedulionvert.fraction;

public record Fraction(int value, int denominator) {

  public Fraction(int numerator) {
    this(numerator, 1);
  }

  public Fraction add(Fraction fraction) {
    if(denominator!= fraction.denominator){
      return new Fraction(value*fraction.denominator+fraction.value*denominator,
              denominator*fraction.denominator);
    }
    return new Fraction(value + fraction.value);
  }
}
