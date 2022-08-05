package gradle.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({"1,1", "3,Fizz", "5,Buzz", "30, FizzBuzz"})
    void return_the_correct_output(Integer input, String expected) {
        FizzBuzz newObject = new FizzBuzz();
        String result = newObject.fizzBuzz(input);
        assertEquals(expected, result);
    }
}
