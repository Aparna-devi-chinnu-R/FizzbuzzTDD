package com.thoughtworks.practice;

public class Fizzbuzz {
    public String isFizzOrBuzz(String input) {
        if (!isNumeric(input)) return input;
        return fizzbuzz(input);
    }

    private String fizzbuzz(String input) {
        long number = Long.parseLong(input);
        if (number % 5 == 0 && number % 3 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        }
        return "not fizzy or buzzy";
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
