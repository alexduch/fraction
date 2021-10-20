package fr.lacombedulionvert.fraction;

public record SimpleFraction(int numerator, int denominator) {

  public SimpleFraction(int numerator) {
    this(numerator, 1);
  }

  public SimpleFraction add(SimpleFraction simpleFraction) {
    return new SimpleFraction(numerator * simpleFraction.denominator + simpleFraction.numerator * denominator,
              denominator * simpleFraction.denominator);

  }
}
