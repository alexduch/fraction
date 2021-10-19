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
}
