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
    @CsvSource(value = {"1,0,1", "1,1,2", "-1,2,1"})
    void shouldHandleFractionsAdditionWithDefaultDenominator(
            int givenLeft, int givenRight, int expected) {
        Fraction left = Fraction.of(givenLeft);
        Fraction right = Fraction.of(givenRight);

        Fraction result = left.add(right);

        assertThat(result).isEqualTo(Fraction.of(expected));
    }

    @Test
    void shouldReturnOneOnTwoWhenAddZeroToOneOnTwo() {
        Fraction oneOnTwo = Fraction.of(1, 2);

        Fraction result = oneOnTwo.add(Fraction.of(0, 1));

        assertThat(result).isEqualTo(oneOnTwo);
    }

    @Test
    void shouldReturnOneOnTwoWhenAddOneOnTwoToZero() {
        Fraction oneOnTwo = Fraction.of(1, 2);

        Fraction result = Fraction.of(0).add(oneOnTwo);

        assertThat(result).isEqualTo(oneOnTwo);
    }

    @Test
    void shouldReturnFiveOnTwoWhenOneOnTwoPlusTwo() {
        Fraction left = Fraction.of(1, 2);
        Fraction right = Fraction.of(2, 1);

        Fraction result = left.add(right);

        assertThat(result).isEqualTo(Fraction.of(5, 2));
    }

    @ParameterizedTest
    @MethodSource("testData")
    void name(SimpleFraction left, SimpleFraction right, SimpleFraction expected) {
        assertThat(left.add(right)).isEqualTo(expected);
    }

    static List<Arguments> testData() {
        return List.of(
                Arguments.of(Fraction.of(1, 2), Fraction.of(1, 3), Fraction.of(5, 6)));
    }
}
