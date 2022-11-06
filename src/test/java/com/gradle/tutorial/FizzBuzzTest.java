package com.gradle.tutorial;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void FizzBuzzNormalNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assertions.assertEquals("1", fb.Convert(1));
        Assertions.assertEquals("2", fb.Convert(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assertions.assertEquals("Fizz", fb.Convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assertions.assertEquals("Buzz", fb.Convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assertions.assertEquals("Buzz", fb.Convert(5));
    }

}