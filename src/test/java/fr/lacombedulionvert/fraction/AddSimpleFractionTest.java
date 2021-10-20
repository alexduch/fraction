package fr.lacombedulionvert.fraction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AddSimpleFractionTest {

  @ParameterizedTest
  @CsvSource(value = {"0,0,0", "0,1,1", "1,0,1", "1,1,2", "-1,2,1"})
  void shouldHandleFractionsAdditionWithDefaultDenominator(
      int givenLeft, int givenRight, int expected) {
    Fraction left = new SimpleFraction(givenLeft);
    SimpleFraction right = new SimpleFraction(givenRight);

    Fraction result = left.add(right);

    assertThat(result).isEqualTo(new SimpleFraction(expected));
  }

  @Test
  void shouldReturnOneOnTwoWhenAddZeroToOneOnTwo() {
    Fraction oneOnTwo = new SimpleFraction(1, 2);

    Fraction result = oneOnTwo.add(new SimpleFraction(0, 1));

    assertThat(result).isEqualTo(oneOnTwo);
  }

  @Test
  void shouldReturnOneOnTwoWhenAddOneOnTwoToZero() {
    SimpleFraction oneOnTwo = new SimpleFraction(1, 2);

    Fraction result = new SimpleFraction(0).add(oneOnTwo);

    assertThat(result).isEqualTo(oneOnTwo);
  }

  @Test
  void shouldReturnFiveOnTwoWhenOneOnTwoPlusTwo() {
    Fraction left = new SimpleFraction(1, 2);
    SimpleFraction right = new SimpleFraction(2, 1);

    Fraction result = left.add(right);

    assertThat(result).isEqualTo(new SimpleFraction(5, 2));
  }

  @ParameterizedTest
  @MethodSource("testData")
  void name(SimpleFraction left, SimpleFraction right, SimpleFraction expected) {
    assertThat(left.add(right)).isEqualTo(expected);
  }

  static List<Arguments> testData() {
    return List.of(
        Arguments.of(new SimpleFraction(1, 2), new SimpleFraction(1, 3), new SimpleFraction(5, 6)));
  }
}
