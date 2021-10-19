package fr.lacombedulionvert.fraction;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class AddFractionTest {

  @ParameterizedTest
  @CsvSource(value = {"0,0,0", "0,1,1", "1,0,1", "1,1,2"})
  void shouldHandleFractionsAddition(int givenLeft, int givenRight, int expected) {
    Fraction left = new Fraction(givenLeft);
    Fraction right = new Fraction(givenRight);

    Fraction result = left.add(right);

    assertThat(result).isEqualTo(new Fraction(expected));
  }
}
