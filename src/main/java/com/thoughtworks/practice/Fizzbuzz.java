package com.thoughtworks.practice;

public class Fizzbuzz {
    public String isFizzOrBuzz(String input) {
        if (!isNumeric(input)) return input;
        return fizzbuzz(input);
    }

    private String fizzbuzz(String input) {
        long number = Long.parseLong(input);
        if (isDivisibleByFiveAndThree(number)) {
            return "fizzbuzz";
        } else if (isDivisibleByFive(number)) {
            return "buzz";
        } else if (isDivisibleByThree(number)) {
            return "fizz";
        }
        return "not fizzy or buzzy";
    }

    private boolean isDivisibleByThree(long number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleByFive(long number) {
        return number % 5 == 0;
    }

    private boolean isDivisibleByFiveAndThree(long number) {
        return isDivisibleByFive(number) && isDivisibleByThree(number);
    }

    private boolean isNumeric(String input) {
        try {
            Long.parseLong(input);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
