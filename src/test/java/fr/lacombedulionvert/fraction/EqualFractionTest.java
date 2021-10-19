package fr.lacombedulionvert.fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqualFractionTest {

  @Test
  void shouldBeEqual() {
    assertThat(new Fraction(1)).isEqualTo(new Fraction(1));
  }
}
