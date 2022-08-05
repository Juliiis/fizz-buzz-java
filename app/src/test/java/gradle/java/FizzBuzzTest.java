package gradle.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
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
}
