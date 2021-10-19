package fr.lacombedulionvert.fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddFractionTest {

  @Test
  void shouldReturnZeroWhenAddZeroToZero() {
    Fraction zero = new Fraction(0);

    Fraction result = zero.add(zero);

    assertThat(result).isEqualTo(zero);
  }

  @Test
  void shouldReturnOneWhenAddOneToZero() {
    Fraction one = new Fraction(1);

    Fraction result = new Fraction(0).add(one);

    assertThat(result).isEqualTo(one);
  }

  @Test
  void shouldReturnOneWhenAddZeroToOne() {
    Fraction one = new Fraction(1);

    Fraction zero = new Fraction(0);

    assertThat(one.add(zero)).isEqualTo(one);
  }

  @Test
  void shouldReturnTwoWhenAddOneToOne() {
    assertThat(new Fraction(1).add(new Fraction(1))).isEqualTo(new Fraction(2));
  }
}
