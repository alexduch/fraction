package fr.lacombedulionvert.fraction;

public record Fraction(int value) {

  public Fraction add(Fraction fraction) {
    if (value == 0) {
      return fraction;
    }
    return new Fraction(value + fraction.value);
  }
}
