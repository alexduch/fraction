package fr.lacombedulionvert.fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FractionTest {

  @Test
  void shouldCreateAZero() {
    assertThat(Fraction.of(0, 2)).isInstanceOf(Zero.class);
  }

  @Test
  void shouldCreateASimpleFraction() {
    assertThat(Fraction.of(1, 2)).isInstanceOf(SimpleFraction.class);
  }
}
