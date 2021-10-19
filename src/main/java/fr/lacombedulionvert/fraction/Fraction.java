package fr.lacombedulionvert.fraction;

public record Fraction(int value) {

  public Fraction add(Fraction fraction) {
    return new Fraction(value + fraction.value);
  }
}
