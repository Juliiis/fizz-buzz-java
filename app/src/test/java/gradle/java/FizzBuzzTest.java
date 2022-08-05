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

 /*   @Test
    void return_the_number_for_all_numbers(){
        //arrange
        int input = 1;
        FizzBuzz newObject = new FizzBuzz();
        String correctResult = "1";

        //act
        String result = newObject.fizzBuzz(input);

        //assert
        assertThat(result).isEqualTo(correctResult);
    }

    @Test
    void return_fizz_for_the_numbers_multiple_for_three(){
        //arrange
        int input = 3;
        FizzBuzz newObject = new FizzBuzz();
        String correctResult = "Fizz";
        //act
        String result = newObject.fizzBuzz(input);
        //assert
        assertThat(result).isEqualTo(correctResult);
    }

    @Test
    void return_buzz_for_the_numbers_multiple_for_five(){
        int input = 5;
        FizzBuzz newObject = new FizzBuzz();
        String correctResult = "Buzz";

        String result = newObject.fizzBuzz(input);

        assertThat(result).isEqualTo(correctResult);
    }

    @Test
    void return_fizzbuzz_for_the_numbers_multiple_for_five_and_three(){
        int input = 30;
        FizzBuzz newObject = new FizzBuzz();
        String correctResult = "FizzBuzz";

        String result = newObject.fizzBuzz(input);

        assertThat(result).isEqualTo(correctResult);
    }
    */
}
