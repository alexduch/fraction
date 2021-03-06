package fr.lacombedulionvert.fraction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AddFractionTest {

  @ParameterizedTest
  @CsvSource(value = {"0,0,0", "0,1,1", "1,0,1", "1,1,2", "-1,2,1"})
  void shouldHandleFractionsAdditionWithDefaultDenominator(
      int givenLeft, int givenRight, int expected) {
    Fraction left = new Fraction(givenLeft);
    Fraction right = new Fraction(givenRight);

    Fraction result = left.add(right);

    assertThat(result).isEqualTo(new Fraction(expected));
  }

  @Test
  void shouldReturnOneOnTwoWhenAddZeroToOneOnTwo() {
    Fraction oneOnTwo = new Fraction(1, 2);

    Fraction result = oneOnTwo.add(new Fraction(0, 1));

    assertThat(result).isEqualTo(oneOnTwo);
  }

  @Test
  void shouldReturnOneOnTwoWhenAddOneOnTwoToZero() {
    Fraction oneOnTwo = new Fraction(1, 2);

    Fraction result = new Fraction(0).add(oneOnTwo);

    assertThat(result).isEqualTo(oneOnTwo);
  }

  @Test
  void shouldReturnFiveOnTwoWhenOneOnTwoPlusTwo() {
    Fraction left = new Fraction(1, 2);
    Fraction right = new Fraction(2, 1);

    Fraction result = left.add(right);

    assertThat(result).isEqualTo(new Fraction(5, 2));
  }

  @ParameterizedTest
  @MethodSource("testData")
  void name(Fraction left, Fraction right, Fraction expected) {
    assertThat(left.add(right)).isEqualTo(expected);
  }

  static List<Arguments> testData() {
    return List.of(Arguments.of(new Fraction(1, 2), new Fraction(1, 3), new Fraction(5, 6)));
  }
}
