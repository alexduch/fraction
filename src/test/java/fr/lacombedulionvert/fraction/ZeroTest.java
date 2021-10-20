package fr.lacombedulionvert.fraction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ZeroTest {

    //TODO improve test readability
    @ParameterizedTest
    @CsvSource(value = {"0,0,0", "0,1,1", "1,0,1"})
    void shouldBeNeutralForAddition(
            int givenLeft, int givenRight, int expected) {
        Fraction left = Fraction.of(givenLeft);
        Fraction right = Fraction.of(givenRight);

        Fraction result = left.add(right);

        Assertions.assertThat(result).isEqualTo(Fraction.of(expected));
    }
}
