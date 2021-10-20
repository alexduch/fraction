package fr.lacombedulionvert.fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqualSimpleFractionTest {

  @Test
  void shouldBeEqual() {
    assertThat(new SimpleFraction(1)).isEqualTo(new SimpleFraction(1));
  }

  @Test
  void shouldBeEqualWithDenominators() {
    assertThat(new SimpleFraction(1, 2)).isEqualTo(new SimpleFraction(1, 2));
  }

  @Test
  void shouldHandleDefaultDenominator() {
    assertThat(new SimpleFraction(5)).isEqualTo(new SimpleFraction(5, 1));
  }
}
