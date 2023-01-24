package com.thoughtworks.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    @Test
    void shouldReturnBuzzIfNumberIsDivisibleByFive() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String output = fizzbuzz.isFizzOrBuzz("5");
        assertEquals("buzz",output);
    }

    @Test
    void shouldReturnFizzIfNumberIsDivisibleByThree() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String output = fizzbuzz.isFizzOrBuzz("9");
        assertEquals("fizz",output);
    }

    @Test
    void shouldReturnFizzBuzzIfNumberIsDivisibleByBothThreeAndFive() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String output = fizzbuzz.isFizzOrBuzz("15");
        assertEquals("fizzbuzz",output);
    }

    @Test
    void shouldReturnNotFizzyOrBuzzyWhenNumberIsNotDivisibleByEitherFiveOrThree() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String output = fizzbuzz.isFizzOrBuzz("8");
        assertEquals("not fizzy or buzzy",output);
    }

    @Test
    void shouldReturnInputIfInputIsNotAnNumber() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String output = fizzbuzz.isFizzOrBuzz("random");
        assertEquals("random",output);
    }
}