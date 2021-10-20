package fr.lacombedulionvert.fraction;

public class Zero implements Fraction {
  @Override
  public Fraction add(SimpleFraction simpleFraction) {
    return simpleFraction;
  }
}
