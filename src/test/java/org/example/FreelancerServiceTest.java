package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @Test
    public void testCalculate() {
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(income:10_000, expenses:3_000, threshold:20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculate2() {
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(income:100_000, expenses:60_000, threshold:150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}