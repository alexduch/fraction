package fr.lacombedulionvert.fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqualFractionTest {

  @Test
  void shouldBeEqual() {
    assertThat(new Fraction(1)).isEqualTo(new Fraction(1));
  }

  @Test
  void shouldBeEqualWithDenominators() {
    assertThat(new Fraction(1, 2)).isEqualTo(new Fraction(1, 2));
  }
}
