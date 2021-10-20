package fr.lacombedulionvert.fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ZeroTest {

  @Test
  void shouldBeNeutralForAddition() {
    Zero zero = new Zero();
    SimpleFraction one = new SimpleFraction(1);

    assertThat(zero.add(one)).isEqualTo(one);
  }
}
