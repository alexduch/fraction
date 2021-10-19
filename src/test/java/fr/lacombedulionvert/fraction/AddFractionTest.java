package fr.lacombedulionvert.fraction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
    Fraction one = new Fraction(1);

    Fraction result = one.add(one);

    assertThat(result).isEqualTo(new Fraction(2));
  }

  @ParameterizedTest
  @CsvSource(
      value = {
        "0,0,0", "0,1,1", "1,0,1",
      })
  void test(int givenLeft, int givenRight, int expected) {
    Fraction left = new Fraction(givenLeft);
    Fraction right = new Fraction(givenRight);

    Fraction result = left.add(right);

    assertThat(result).isEqualTo(new Fraction(expected));
  }
}
