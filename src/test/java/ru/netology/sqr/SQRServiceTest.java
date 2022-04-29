package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void numberOfSquareSmall() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.numberOfSquares(200, 300);

        assertEquals(expected, actual);

    }

    @Test
    void numberOfSquareMedium() {
        SQRService sqrService = new SQRService();

        int expected = 40;
        int actual = sqrService.numberOfSquares(200, 3000);

        assertEquals(expected, actual);
    }

    @Test
    void numberOfSquareLarge() {
        SQRService sqrService = new SQRService();

        int expected = 85;
        int actual = sqrService.numberOfSquares(200, 30_000);

        assertEquals(expected, actual);
    }
}